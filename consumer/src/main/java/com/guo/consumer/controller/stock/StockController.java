package com.guo.consumer.controller.stock;

import com.alibaba.dubbo.config.annotation.Reference;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.guo.api.service.stock.StockService;
import com.guo.client.model.stock.StockDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Reference(loadbalance = "txlcn_random")
    private StockService stockService;

    @RequestMapping("/createStock")
    @LcnTransaction
    public String createStock(StockDO stockDO){
        stockService.createStock(stockDO);
        return "新增数量成功";
    }
}
