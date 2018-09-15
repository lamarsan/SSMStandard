package com.test.dao;

import com.test.entity.UserEntity;

import java.util.List;

public interface UserDao {
    List<UserEntity> selectAll();

    int insert(UserEntity userEntity);

    int update(UserEntity userEntity);
}
