package com.onroadrui.enums;

import lombok.Getter;

/**
 * Created by onroadrui on 17/11/3.
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "上架"),
    DOWN(1, "下架");

    private Integer id;

    private String message;


    ProductStatusEnum(Integer id, String message) {
        this.id = id;
        this.message = message;
    }
}
