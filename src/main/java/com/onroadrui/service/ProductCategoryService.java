package com.onroadrui.service;

import com.onroadrui.domain.ProductCategory;

import java.util.List;

/**
 * Created by onroadrui on 17/11/2.
 */
public interface ProductCategoryService {

    ProductCategory getProuctCategory(Integer id);

    List<ProductCategory> listAllProductCategory();

    List<ProductCategory> getByProductCategoryTypes(List<Integer> ids);

    int saveProductCategory(ProductCategory productCategory);
}
