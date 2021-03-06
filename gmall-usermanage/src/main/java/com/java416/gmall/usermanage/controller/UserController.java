package com.java416.gmall.usermanage.controller;

import com.java416.gmall.bean.UmsMember;
import com.java416.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UmsMember> findAll(){
        return userService.findAll();
    }
}
