package com.guo.api.service.stock;

import com.guo.client.model.stock.StockDO;

import java.util.List;

public interface StockService {
    StockDO createStock(StockDO stockDO);
    Boolean updateStock(StockDO stockDO);
    List<StockDO> queryAllByCommodityId(String commodityId);
    StockDO queryOneByCommodityModelId(String commodityModelId);
    Integer delStockByCommodityModelId(String commodityModelId,Integer sum);
}
