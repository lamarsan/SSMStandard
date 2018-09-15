package com.test.service;

import com.test.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> listUserAll();

    int insert(UserEntity userEntity);

    int update(UserEntity userEntity);
}
