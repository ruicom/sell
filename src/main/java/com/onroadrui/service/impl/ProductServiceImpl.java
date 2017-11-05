package com.onroadrui.service.impl;

import com.onroadrui.domain.ProductInfo;
import com.onroadrui.enums.ProductStatusEnum;
import com.onroadrui.repository.ProductInfoRepository;
import com.onroadrui.service.ProductService;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by onroadrui on 17/11/3.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo get(String productId) {
        return productInfoRepository.findOne(productId);
    }

    @Override
    public List<ProductInfo> getOnShelf() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getId());
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        productInfoRepository.save(productInfo);
        return productInfo;
    }
}
