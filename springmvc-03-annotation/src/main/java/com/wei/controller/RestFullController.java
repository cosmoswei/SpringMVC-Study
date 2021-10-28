package com.wei.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author 21170
 */
@Controller
public class RestFullController {

    //原来的:http://localhost:8080/springmvc_03_annotation_war_exploded/add?a=1&b=2
    //RestFull:http://localhost:8080/springmvc_03_annotation_war_exploded/add/1/2

    //    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果1为:" + res);
        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果2为:" + res);
        return "test";
    }
}
