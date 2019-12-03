package com.guo.api.service.commodity;

import com.guo.client.model.commodity.CommodityDO;
import com.guo.client.model.commodity.CommodityModelDO;

import java.util.List;

public interface CommodityService {
    CommodityDO createCommdity(CommodityDO commodityDO);
    Boolean updateCommdityById(CommodityDO commodityDO);
    List<CommodityDO> queryAllBySellerId(String sellerId);
    CommodityModelDO createCommdityModel(CommodityModelDO commodityModelDO);
    Boolean updateCommdityModelById(CommodityModelDO commodityModelDO);
    List<CommodityModelDO> queryAllModelByCommodityId(String commodityId);
}
