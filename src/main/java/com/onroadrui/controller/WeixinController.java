package com.onroadrui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by onroadrui on 17/11/3.
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public String auth(@RequestParam("code") String code) {
        log.info("进入到auth方法里面...");
        log.info("code:{}", code);
        return "code" + code;
    }
}
