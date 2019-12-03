package com.guo.seckill.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guo.api.service.ticket.TicketService;
import com.guo.common.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service(interfaceClass = TicketService.class)
@Component
public class TicketServiceImpl implements TicketService {
    @Autowired
    private RedisUtils redisUtils;

    @Override
    public Long createTicket(String key,Object... objects) {
        return redisUtils.sSet(key,objects);
    }

    @Override
    public List<Object> sellTicket(String key, Long sum) {
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < sum; i++) {
            Object object = redisUtils.setPop(key);
            if (object == null){
                redisUtils.sSet(key,result.toArray());
                return null;
            }
            result.add(object);
        }
        return result;
    }
}
