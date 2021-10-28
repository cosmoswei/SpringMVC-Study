package com.wei.controller;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wei.pojo.User;
import com.wei.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
//@RestController=@Controller+@ResponseBody
public class UserController {
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @RequestMapping("/j1")
    @ResponseBody
    //他就不会走视图解析器，直接返回字符串
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("宇宙伟1", 21, "男");
        return mapper.writeValueAsString(user);
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = new ArrayList<User>();
        User user1 = new User("宇宙伟1", 21, "男");
        User user2 = new User("宇宙伟2", 21, "男");
        User user3 = new User("宇宙伟3", 21, "男");
        User user4 = new User("宇宙伟4", 21, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    @ResponseBody
    public String json3() {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String json4() throws JsonProcessingException {
        Date date = new Date();
        return JSON.toJSONStringWithDateFormat(date, "yyyy-MM-dd HH:mm:ss");
    }
}
