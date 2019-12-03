package com.guo.stock;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guo.stock.dao")
@EnableDubboConfiguration
@EnableDistributedTransaction
public class StockApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }

}
