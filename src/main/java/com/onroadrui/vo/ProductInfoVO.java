package com.onroadrui.vo;

import java.math.BigDecimal;

import lombok.Data;

/**
 * Created by onroadrui on 17/11/3.
 */
@Data
public class ProductInfoVO {

    private String id;

    private String  name;

    private String description;

    private BigDecimal price;

    private String imagePath;
}


