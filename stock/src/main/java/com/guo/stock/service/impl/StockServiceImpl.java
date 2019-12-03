package com.guo.stock.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.guo.api.service.stock.StockService;
import com.guo.client.model.stock.StockDO;
import com.guo.stock.dao.StockDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Service(interfaceClass = StockService.class)
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDOMapper stockDOMapper;

    @Override
    @TxTransaction
    public StockDO createStock(StockDO stockDO) {
        stockDO.setStockId(UUID.randomUUID().toString().replace("-",""));
        stockDOMapper.insertSelective(stockDO);
        return stockDO;
    }

    @Override
    @TxTransaction
    public Boolean updateStock(StockDO stockDO) {
        try {
            if (stockDO.getId()==null){
                return false;
            }
            stockDOMapper.updateByPrimaryKeySelective(stockDO);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    @TxTransaction
    public List<StockDO> queryAllByCommodityId(String commodityId) {
        return stockDOMapper.queryAllByCommodityId(commodityId);
    }

    @Override
    @TxTransaction
    public StockDO queryOneByCommodityModelId(String commodityModelId) {
        return stockDOMapper.queryOneByCommodityModelId(commodityModelId);
    }

    @Override
    @TxTransaction
    public Integer delStockByCommodityModelId(String commodityModelId, Integer sum) {
        StockDO stockDO = queryOneByCommodityModelId(commodityModelId);
        stockDO.setTotalSurplus(stockDO.getTotalSurplus()-sum);
        stockDOMapper.updateByPrimaryKeySelective(stockDO);
        return stockDO.getTotalSurplus();
    }
}
