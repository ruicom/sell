package com.onroadrui.repository;

import com.onroadrui.domain.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by onroadrui on 17/11/2.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> ids);
}
