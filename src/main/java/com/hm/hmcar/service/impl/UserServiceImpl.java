package com.hm.hmcar.service.impl;

import com.hm.hmcar.dao.UserDao;
import com.hm.hmcar.entity.User;
import com.hm.hmcar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User login(String phone, String password) {
        User user = userDao.findUserByName(phone);

        return user;
    }

    @Override
    public void zhuce(User user) {

    }
}
