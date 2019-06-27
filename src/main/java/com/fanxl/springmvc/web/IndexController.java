package com.fanxl.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanxl12
 * @description
 * @date 2019/6/27 9:22
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
