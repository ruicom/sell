package com.onroadrui.repository;

import com.onroadrui.domain.ProductInfo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by onroadrui on 17/11/3.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{

    public List<ProductInfo> findByProductStatus(Integer status);
}
