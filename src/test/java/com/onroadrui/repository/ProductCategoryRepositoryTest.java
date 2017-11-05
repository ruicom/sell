package com.onroadrui.repository;

import com.onroadrui.domain.ProductCategory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by onroadrui on 17/11/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {


    @Autowired
    public ProductCategoryRepository productCategoryRepository;

    @Test
    public void testFindOne() {
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        Assert.assertNotNull(productCategory);
    }

    @Test
    @Transactional // 单独回滚
    public void testSave() {
        ProductCategory productCategory = productCategoryRepository.findOne(2);
        productCategory.setCategoryName("hello1");
        productCategory.setCategoryId(2);
        productCategoryRepository.save(productCategory);

    }

    @Test
    public void testAdd() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("测试编码");
        productCategory.setCategoryType(1);
        productCategoryRepository.save(productCategory);
    }

    @Test
    public void testFindByCategoryTypesInTest() {
        List<ProductCategory> categoryTypes = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(1,2));
        Assert.assertEquals(5, categoryTypes.size());
    }



}
