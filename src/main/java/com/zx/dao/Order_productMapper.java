package com.zx.dao;

import com.zx.model.Order_product;
import com.zx.model.Order_productKey;

public interface Order_productMapper {
    int deleteByPrimaryKey(Order_productKey key);

    int insert(Order_product record);

    int insertSelective(Order_product record);

    Order_product selectByPrimaryKey(Order_productKey key);

    int updateByPrimaryKeySelective(Order_product record);

    int updateByPrimaryKey(Order_product record);
}