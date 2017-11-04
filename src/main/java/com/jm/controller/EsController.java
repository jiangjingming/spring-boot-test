package com.jm.controller;

import cn.jjm.annotation.AccessMonitor;
import cn.jjm.service.AccessMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangjingming on 2017/10/26.
 */
@RestController
public class EsController {

    @Autowired
    private AccessMonitorService accessMonitorService;


    @RequestMapping("/baili")
    @AccessMonitor(methodName = "baili")
    public Object find() {
        return "hello word";
    }

    @RequestMapping(value = "/findbaili")
    public Object findtest() {
        return accessMonitorService.findMethodName("baili");
    }

    @RequestMapping(value = "/find")
    @AccessMonitor(methodName = "find")
    public Object findShow(@RequestParam String methodName) {
        return accessMonitorService.findMethodName(methodName);
    }
}
