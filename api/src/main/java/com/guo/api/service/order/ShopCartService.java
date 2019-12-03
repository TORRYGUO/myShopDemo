package com.guo.api.service.order;

import com.guo.client.model.shopcart.ShopCartDO;

import java.util.List;

public interface ShopCartService {
    ShopCartDO addShopCart(ShopCartDO shopCartDO);
    Boolean updateShopCartById(ShopCartDO shopCartDO);
    List<ShopCartDO> queryAllShopCartByUserId(String userId);
    Integer removerShopCartById(Long id);
    List<ShopCartDO> queryAllShopCartInId(List<Long> ids);
    Integer removerShopCartByIdR(List<Long> ids);
}
