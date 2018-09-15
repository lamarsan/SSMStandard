package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.UserEntity;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;


    @Override
    public List<UserEntity> listUserAll() {
        return userDao.selectAll();
    }

    @Override
    public int insert(UserEntity userEntity) {
        return userDao.insert(userEntity);
    }

    @Override
    public int update(UserEntity userEntity) {
        return userDao.update(userEntity);
    }

}
