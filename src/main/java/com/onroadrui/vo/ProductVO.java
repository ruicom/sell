package com.onroadrui.vo;

import java.util.List;

import lombok.Data;

/**
 * Created by onroadrui on 17/11/3.
 */
@Data
public class ProductVO {

    private String categoryName;

    private Integer categoryType;

    private Integer categoryId;

    private List<ProductVO> foods;


}
