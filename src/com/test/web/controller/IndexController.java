/**
 * Created by wzq on 2015/10/3.
 */

package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.T;

@Controller
@RequestMapping("index/")
public class IndexController {
    @RequestMapping("i.html")
    public String index() {
        System.out.println("niubility");
        new T();
        return "index";
    }
}
