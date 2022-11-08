package com.taytay.controller.impl;

import com.taytay.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/users")
//请求路径前缀
public class UserControllerImpl {


    @RequestMapping(value = "/users/{string}",method = RequestMethod.GET)
    public User save(@PathVariable String string){
        User user = new User();
        user.setRepo(string);
        user.setShop("dsad");
        return user;
    }



    @RequestMapping("/index")
    public String jump(){
        System.out.println("jump ....");
        return "index";

    }

    @RequestMapping("/parm")
    public String save(@RequestParam("name")String username, int age){
        System.out.println("名字是 = >" + username);
        System.out.println("年龄是 = >" + age);
        System.out.println("saving ....");
        return "{'module':'Parm save'}";
    }

    @RequestMapping("/pojoParm")
    public String pojoParam(User user){
        System.out.println("pojo参数传递 user =>" + user);
        return "{'module':'pojo param'}";
    }

    @RequestMapping("/listParamforJSON")
    public String listParamforJSON(@RequestBody List<String> list){
        System.out.println("pojo参数传递 user =>" + list);
        return "{'module':'list param'}";
    }

    @RequestMapping("/listPojoParamforJSON")
    public String listPojoParamforJSON(List<User> list){
        System.out.println("pojo参数传递 user =>" + list);
        return "{'module':'listPojoParam'}";
    }

}
