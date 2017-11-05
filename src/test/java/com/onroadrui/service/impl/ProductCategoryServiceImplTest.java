package com.onroadrui.service.impl;

import com.onroadrui.domain.ProductCategory;
import com.onroadrui.service.ProductCategoryService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by onroadrui on 17/11/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Resource
    private ProductCategoryService productCategoryService;

    @Test
    public void getProuctCategory() throws Exception {
        ProductCategory productCategory = productCategoryService.getProuctCategory(1);
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void listAllProductCategory() throws Exception {
        List<ProductCategory> productCategoryList = productCategoryService.listAllProductCategory();
        Assert.assertEquals(5, productCategoryList.size());
    }

    @Test
    public void getByProductCategoryTypes() throws Exception {
        List<ProductCategory> productCategories = productCategoryService.getByProductCategoryTypes(Arrays.asList(1));
        Assert.assertEquals(5, productCategories.size());
    }


    @Test
    @Transactional
    public void saveProductCategory() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("测试2");
        productCategory.setCategoryType(2);
        int id = productCategoryService.saveProductCategory(productCategory);
        Assert.assertNotEquals(0, id);
    }

}