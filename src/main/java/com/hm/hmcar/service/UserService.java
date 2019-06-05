package com.hm.hmcar.service;

import com.hm.hmcar.entity.User;

public interface UserService {
    //login
    public User login(String phone, String password);

    //注册
    public void  zhuce(User user);

}
