package com.wei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 21170
 */
@Controller
//@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello SpringMVC Annotation!(h1)");

        return "hello";
        //会被视图解析器处理
    }

    @RequestMapping("/h2")
    public String hello2(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello SpringMVC Annotation!(h2)");

        return "hello";
    }

    @RequestMapping("/h3")
    public String hello3(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello SpringMVC Annotation!(h3)");

        return "hello";
    }
}
