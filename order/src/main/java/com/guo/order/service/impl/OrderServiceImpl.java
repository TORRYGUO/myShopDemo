package com.guo.order.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.guo.api.service.order.OrderService;
import com.guo.client.model.order.OrderDO;
import com.guo.client.model.order.OrderDetailDO;
import com.guo.client.model.order.OrderVO;
import com.guo.order.dao.OrderDOMapper;
import com.guo.order.dao.OrderDetailDOMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDOMapper orderDOMapper;

    @Autowired
    private OrderDetailDOMapper orderDetailDOMapper;

    @Override
    @TxTransaction
    public OrderVO createOrder(OrderVO orderVO) {
        OrderDO orderDO = new OrderDO();
        BeanUtils.copyProperties(orderVO,orderDO);
        List<OrderDetailDO> orderDetails = orderVO.getOrderDetails();
        orderDOMapper.insertSelective(orderDO);
        orderDetailDOMapper.insertAll(orderDetails);
//        for (int i = 0; i < orderDetails.size(); i++) {
//            OrderDetailDO orderDetailDO = orderDetails.get(i);
//            orderDetailDOMapper.insert(orderDetailDO);
//        }

        orderVO.setId(orderDO.getId());
        return orderVO;
    }

    @Override
    public Boolean updateOrderById(OrderDO orderDO) {
        try {
            if (orderDO.getId()==null){
                return false;
            }
            orderDOMapper.updateByPrimaryKeySelective(orderDO);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<OrderVO> queryAllOrderByUserId(String userId) {
        return null;
    }

    @Override
    public Integer removeOrderById(Long id) {
        OrderDO orderDO = orderDOMapper.selectByPrimaryKey(id);
        orderDetailDOMapper.deletAllByOrderId(orderDO.getOrderId());
        return orderDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Boolean updateOrderDetailById(OrderDetailDO orderDetailDO) {
        try {
            if (orderDetailDO.getId()==null){
                return false;
            }
            orderDetailDOMapper.updateByPrimaryKeySelective(orderDetailDO);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Integer removeOrderDetailById(Long id) {
        return orderDetailDOMapper.deleteByPrimaryKey(id);
    }
}
