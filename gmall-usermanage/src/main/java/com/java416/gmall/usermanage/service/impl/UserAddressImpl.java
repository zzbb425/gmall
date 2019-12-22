package com.java416.gmall.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java416.gmall.bean.UmsMemberReceiveAddress;
import com.java416.gmall.service.UserAddressService;
import com.java416.gmall.usermanage.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserAddressImpl implements UserAddressService {

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getUserAddressList(String userId) {
        List<UmsMemberReceiveAddress> addressList = null;
        UmsMemberReceiveAddress userAddress = new UmsMemberReceiveAddress();

        addressList = userAddressMapper.select(userAddress);
        return addressList;

    }
}
