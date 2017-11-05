package com.onroadrui.service.impl;

import com.onroadrui.domain.ProductCategory;
import com.onroadrui.repository.ProductCategoryRepository;
import com.onroadrui.service.ProductCategoryService;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by onroadrui on 17/11/2.
 */
@Service
@Slf4j
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Resource
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory getProuctCategory(Integer id) {
        return productCategoryRepository.findOne(id);
    }

    @Override
    public List<ProductCategory> listAllProductCategory() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> getByProductCategoryTypes(List<Integer> ids) {
        return productCategoryRepository.findByCategoryTypeIn(ids);
    }

    @Override
    public int saveProductCategory(ProductCategory productCategory) {
        productCategoryRepository.save(productCategory);
        return productCategory.getCategoryId();
    }
}
