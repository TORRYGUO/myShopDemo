package com.guo.consumer.controller.seckill;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guo.api.service.ticket.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Reference(loadbalance = "txlcn_random")
    private TicketService ticketService;

    @RequestMapping("/createTicket")
    public String createTicket(){
        return null;
    }
}
