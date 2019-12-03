package com.guo.consumer.controller.commodity;

import com.alibaba.dubbo.config.annotation.Reference;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.guo.api.service.commodity.CommodityService;
import com.guo.client.model.commodity.CommodityDO;
import com.guo.client.model.commodity.CommodityModelDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commodity")
public class CommodityController {

    @Reference(loadbalance = "txlcn_random")
    private CommodityService commodityService;

    @RequestMapping("/createCommdity")
    @LcnTransaction
    public String createCommdity(CommodityDO commodityDO){
        return "创建成功,商品ID是:"+commodityService.createCommdity(commodityDO).getCommodityId();
    }

    @RequestMapping("/updateCommdityById")
    public String updateCommdityById(CommodityDO commodityDO){
        Boolean b = commodityService.updateCommdityById(commodityDO);
        if (b){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @RequestMapping("/queryAllBySellerId")
    public List<CommodityDO> queryAllBySellerId(String sellerId){
        return commodityService.queryAllBySellerId(sellerId);
    }

    @RequestMapping("/createCommdityModel")
    public String createCommdityModel(CommodityModelDO commodityModelDO){
        return "创建成功商品凭品别成功,商品ID是:"+commodityService.createCommdityModel(commodityModelDO).getCommodityId();
    }

    @RequestMapping("/updateCommdityModelById")
    public String updateCommdityModelById(CommodityModelDO commodityModelDO){
        Boolean b = commodityService.updateCommdityModelById(commodityModelDO);
        if (b){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @RequestMapping("/queryAllModelByCommodityId")
    public List<CommodityModelDO> queryAllModelByCommodityId(String commodityId){
        return commodityService.queryAllModelByCommodityId(commodityId);
    }

}
