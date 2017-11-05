package com.onroadrui.service.impl;

import com.onroadrui.domain.ProductInfo;
import com.onroadrui.service.ProductService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by onroadrui on 17/11/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Resource
    private ProductService productService;

    @Test
    public void get() throws Exception {
        ProductInfo productInfo = productService.get("1287");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void getOnShelf() throws Exception {
        List<ProductInfo> productInfoList = productService.getOnShelf();
        Assert.assertNotNull(productInfoList);
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName("脆皮烤鸭1");
        productInfo.setProductId("12879");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的广东烤鸭");
        productInfo.setProductIcon("www.baidu.com");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(1);

        productService.save(productInfo);
        ProductInfo productInfo1 = productService.get("12879");
        Assert.assertNotNull(productInfo1);
    }



}