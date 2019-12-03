package com.guo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDistributedTransaction
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
