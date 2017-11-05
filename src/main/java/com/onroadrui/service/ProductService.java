package com.onroadrui.service;

import com.onroadrui.domain.ProductInfo;

import java.util.List;

/**
 * Created by onroadrui on 17/11/3.
 */
public interface ProductService {

    /**
     * 获取商品
     * @param productId
     * @return
     */
    ProductInfo get(String productId);

    /**
     * 获取已经上架的商品,这里也要做下分页把
     * @return
     */
    List<ProductInfo> getOnShelf();

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存


}
