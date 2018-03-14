package com.zx.dao;

import com.zx.model.Favorite;
import com.zx.model.FavoriteKey;

public interface FavoriteMapper {
    int deleteByPrimaryKey(FavoriteKey key);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    Favorite selectByPrimaryKey(FavoriteKey key);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);
}