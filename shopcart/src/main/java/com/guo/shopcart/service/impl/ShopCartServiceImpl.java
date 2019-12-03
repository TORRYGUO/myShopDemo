package com.guo.shopcart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.guo.api.service.order.ShopCartService;
import com.guo.client.model.shopcart.ShopCartDO;
import com.guo.shopcart.dao.ShopCartDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Service(interfaceClass = ShopCartService.class)
public class ShopCartServiceImpl implements ShopCartService {
    @Autowired
    private ShopCartDOMapper shopCartDOMapper;

    @Override
    @TxTransaction
    public ShopCartDO addShopCart(ShopCartDO shopCartDO) {
        if (shopCartDO.getTotal()<1){
            throw new  RuntimeException("数量要大于1");
        }
        shopCartDO.setCartId(UUID.randomUUID().toString().replace("-",""));
        shopCartDOMapper.insert(shopCartDO);
        return shopCartDO;
    }

    @Override
    @TxTransaction
    public Boolean updateShopCartById(ShopCartDO shopCartDO) {
        try {
            if (shopCartDO.getId()==null){
                return false;
            }
            shopCartDOMapper.updateByPrimaryKeySelective(shopCartDO);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    @TxTransaction
    public List<ShopCartDO> queryAllShopCartByUserId(String userId) {
        return shopCartDOMapper.queryAllByUserId(userId);
    }

    @Override
    @TxTransaction
    public Integer removerShopCartById(Long id) {
        return shopCartDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    @TxTransaction
    public List<ShopCartDO> queryAllShopCartInId(List<Long> ids) {
        return shopCartDOMapper.queryAllShopCartInId(ids);
    }

    @Override
    @TxTransaction
    public Integer removerShopCartByIdR(List<Long> ids) {
        return shopCartDOMapper.removerShopCartInIdsR(ids);
    }
}
