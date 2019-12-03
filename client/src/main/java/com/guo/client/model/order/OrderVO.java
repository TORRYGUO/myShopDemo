package com.guo.client.model.order;

import lombok.Data;

import java.util.List;

@Data
public class OrderVO extends OrderDO {
    private List<OrderDetailDO> orderDetails;
}
