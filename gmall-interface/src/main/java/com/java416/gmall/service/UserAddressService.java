package com.java416.gmall.service;

import com.java416.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserAddressService {

    public List<UmsMemberReceiveAddress> getUserAddressList(String userId);
}
