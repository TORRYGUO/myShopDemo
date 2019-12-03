package com.guo.consumer.controller.shopCart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.guo.api.service.order.ShopCartService;
import com.guo.client.model.shopcart.ShopCartDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shopCart")
public class ShopCartComtroller {
    @Reference(loadbalance = "txlcn_random")
    private ShopCartService shopCartService;

    @RequestMapping("/addShopCart")
    @LcnTransaction
    public String addShopCart(ShopCartDO shopCartDO){
        return "创建成功"+shopCartService.addShopCart(shopCartDO).getCommodityModelId();
    }

    @RequestMapping("updateShopCartById")
    @LcnTransaction
    public String updateShopCartById(ShopCartDO shopCartDO){
        Boolean b = shopCartService.updateShopCartById(shopCartDO);
        if (b){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @RequestMapping("queryAllShopCartByUserId")
    @LcnTransaction
    public List<ShopCartDO> queryAllShopCartByUserId(String userId){
        return shopCartService.queryAllShopCartByUserId(userId);
    }

    @RequestMapping("removerShopCartById")
    @LcnTransaction
    public String removerShopCartById(Long id){
        shopCartService.removerShopCartById(id);
        return "删除成功";
    }
}
