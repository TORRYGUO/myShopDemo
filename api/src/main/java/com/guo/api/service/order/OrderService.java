package com.guo.api.service.order;

import com.guo.client.model.order.OrderDO;
import com.guo.client.model.order.OrderDetailDO;
import com.guo.client.model.order.OrderVO;

import java.util.List;

public interface OrderService {
    OrderVO createOrder(OrderVO orderVO);
    Boolean updateOrderById(OrderDO orderDO);
    List<OrderVO> queryAllOrderByUserId(String userId);
    Integer removeOrderById(Long id);
    Boolean updateOrderDetailById(OrderDetailDO orderDetailDO);
    Integer removeOrderDetailById(Long id);
}
