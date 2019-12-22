package com.java416.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java416.gmall.bean.UmsMemberReceiveAddress;
import com.java416.gmall.service.UserAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Reference
    private UserAddressService userAddressService;

    @ResponseBody
    @RequestMapping("initOrder")
    public String initOrder(String userId){
        List<UmsMemberReceiveAddress> userAddressList = userAddressService.getUserAddressList(userId);

        return "userAddressList";
    }
}
