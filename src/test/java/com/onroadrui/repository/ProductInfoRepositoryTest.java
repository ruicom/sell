package com.onroadrui.repository;

import com.onroadrui.domain.ProductInfo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

/**
 * Created by onroadrui on 17/11/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {


    @Resource
    private ProductInfoRepository productInfoRepository;

    @Test
    public void testSaveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName("脆皮烤鸭");
        productInfo.setProductId("1287");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的广东烤鸭");
        productInfo.setProductIcon("www.baidu.com");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(1);

        productInfoRepository.save(productInfo);
    }

    @Test
    public void findByProductInfoStatus() {
        List<ProductInfo> productInfoList =productInfoRepository.findByProductStatus(1);

        Assert.assertNotNull(productInfoList);
    }
}
