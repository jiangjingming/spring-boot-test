package com.jm.controller;

import com.mhc.ambulance.annotation.ExceptionNotice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangjingming on 2017/10/26.
 */
@RestController("/es")
public class EsController {

    @RequestMapping("/find")
    @ExceptionNotice
    public Object find() {
        return "hello word";
    }
}
