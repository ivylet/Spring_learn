package com.taytay.controller.impl;

import com.taytay.controller.BookController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
//请求路径前缀
public class BookControllerImpl implements BookController {

    @RequestMapping("/save")
    @ResponseBody
    public String use(){
        System.out.println("book saved!");
        return "{'module':'book saving'}";
    }
}
