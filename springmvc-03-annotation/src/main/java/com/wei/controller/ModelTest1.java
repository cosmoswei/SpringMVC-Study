package com.wei.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 21170
 */
@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test1(Model model) {


//        HttpSession session=request.getSession();
//        System.out.println(session.getId());
//        return "hello";


        model.addAttribute("msg", "ModelTest1");
//        转发
//        return "forward:/WEB-INF/jsp/test.jsp";

//        重定向
        return "redirect:/index.jsp";
    }
}
