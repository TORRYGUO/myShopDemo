package com.guo.consumer.controller.order;

import com.guo.consumer.service.order.OrderConsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class  OrderController {
    @Autowired
    private OrderConsService orderConsService;

    @RequestMapping("createOrder")
    public String createOrder(@RequestParam("ids") List<Long> ids){
        return orderConsService.createOrder(ids);
    }
}
