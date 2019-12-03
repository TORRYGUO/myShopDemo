package com.guo.consumer.service.order.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.guo.api.service.order.OrderService;
import com.guo.api.service.order.ShopCartService;
import com.guo.api.service.stock.StockService;
import com.guo.client.model.order.OrderDetailDO;
import com.guo.client.model.order.OrderVO;
import com.guo.client.model.shopcart.ShopCartDO;
import com.guo.consumer.service.order.OrderConsService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class OrderConsServiceImpl implements OrderConsService {
    @Reference(loadbalance = "txlcn_random")
    private OrderService orderService;

    @Reference(loadbalance = "txlcn_random")
    private ShopCartService shopCartService;

    @Reference(loadbalance = "txlcn_random")
    private StockService stockService;

    @Override
    @LcnTransaction
    public String createOrder(List<Long> ids) {
        List<ShopCartDO> shopCarts = shopCartService.queryAllShopCartInId(ids);
        OrderVO orderVO = new OrderVO();
        String orderId = UUID.randomUUID().toString().replace("-","");
        orderVO.setOrderId(orderId);
        List<OrderDetailDO> orderDetails = new ArrayList<>();
        BigDecimal bigDecimal = new BigDecimal(0.00);
        for (int i = 0; i < shopCarts.size(); i++) {
            ShopCartDO shopCart = shopCarts.get(i);
            BigDecimal tol = new BigDecimal(shopCart.getUnitPrice()*shopCart.getTotal());
            OrderDetailDO orderDetailDO = new OrderDetailDO();
            BeanUtils.copyProperties(shopCart,orderDetailDO);
            orderDetailDO.setOrderId(orderId);
            orderDetailDO.setTotalPrice(tol.doubleValue());
            bigDecimal = bigDecimal.add(tol);
            orderDetails.add(orderDetailDO);
            stockService.delStockByCommodityModelId(orderDetailDO.getCommodityModelId(),orderDetailDO.getTotal());
        }
        orderVO.setOrderDetails(orderDetails);
        orderVO.setUserId(shopCarts.get(0).getUserId());
        orderVO.setUnitPrice(bigDecimal.doubleValue());

        orderService.createOrder(orderVO);

        shopCartService.removerShopCartByIdR(ids);
        return "生成订单成功";
    }
}
