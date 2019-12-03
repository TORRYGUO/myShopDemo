package com.guo.shopcart;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guo.shopcart")
@EnableDubboConfiguration
@EnableDistributedTransaction
public class ShopcartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopcartApplication.class, args);
    }

}
