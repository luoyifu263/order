package com.vip.webordertwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class InderController {

    @RequestMapping("/test")
    public String test(){
        return "成功了";
    }

}
