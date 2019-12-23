package com.java416.gmall.service;

import com.java416.gmall.bean.BaseAttrInfo;
import com.java416.gmall.bean.BaseCatalog1;
import com.java416.gmall.bean.BaseCatalog2;
import com.java416.gmall.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {
    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    /**
     * 保存平台属性--平台属性值
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

}
