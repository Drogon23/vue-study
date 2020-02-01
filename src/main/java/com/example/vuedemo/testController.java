/*
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.vuedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 문기선
 */
@RestController
public class testController {

    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "I'm from server";
    }
}
