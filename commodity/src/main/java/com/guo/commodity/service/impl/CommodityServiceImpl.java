package com.guo.commodity.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.guo.api.service.commodity.CommodityService;
import com.guo.client.model.commodity.CommodityDO;
import com.guo.client.model.commodity.CommodityModelDO;
import com.guo.commodity.dao.CommodityDOMapper;
import com.guo.commodity.dao.CommodityModelDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Service(timeout = 5000,interfaceClass = CommodityService.class)
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityDOMapper commodityDOMapper;
    @Autowired
    private CommodityModelDOMapper commodityModelDOMapper;
    @Override
    @TxTransaction
    public CommodityDO createCommdity(CommodityDO commodityDO) {
        commodityDO.setCommodityId(UUID.randomUUID().toString().replace("-",""));
        commodityDO.setSellerId("123");
        commodityDOMapper.insert(commodityDO);
        return commodityDO;
    }

    @Override
    @TxTransaction
    public Boolean updateCommdityById(CommodityDO commodityDO) {
        try {
            if (commodityDO.getId()==null){
                return false;
            }
            commodityDOMapper.updateByPrimaryKeySelective(commodityDO);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    @TxTransaction
    public List<CommodityDO> queryAllBySellerId(String sellerId) {
        return commodityDOMapper.queryAllBySellerId(sellerId);
    }

    @Override
    @TxTransaction
    public CommodityModelDO createCommdityModel(CommodityModelDO commodityModelDO) {
        commodityModelDO.setCommodityModelId(UUID.randomUUID().toString().replace("-",""));
        commodityModelDOMapper.insert(commodityModelDO);
        return commodityModelDO;
    }

    @Override
    @TxTransaction
    public Boolean updateCommdityModelById(CommodityModelDO commodityModelDO) {
        try {
            if (commodityModelDO.getId()==null){
                return false;
            }
            commodityModelDOMapper.updateByPrimaryKeySelective(commodityModelDO);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    @TxTransaction
    public List<CommodityModelDO> queryAllModelByCommodityId(String commodityId) {
        return commodityModelDOMapper.queryAllModelByCommodityId(commodityId);
    }
}
