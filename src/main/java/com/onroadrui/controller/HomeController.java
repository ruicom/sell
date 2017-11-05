package com.onroadrui.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by onroadrui on 17/11/3.
 */
@RestController
public class HomeController {

    @RequestMapping("/alive")
    public String alive() {
        return "hello sell";
    }
}
