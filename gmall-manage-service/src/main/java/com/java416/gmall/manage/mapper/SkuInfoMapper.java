package com.java416.gmall.manage.mapper;

import com.java416.gmall.bean.SkuInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SkuInfoMapper extends Mapper<SkuInfo> {

    public List<SkuInfo> selectSkuInfoListBySpu(long spuId);
}


