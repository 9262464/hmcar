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
        User user = userDao.login(phone);
        if (user != null){
            if (user.getPassword().equals(password)){
                return user;
            }
        }


        return user;
    }

    @Override
    public void zhuce(User user) {
        User phone = userDao.login(user.getPhone());
        if ( phone != null){
            throw new RuntimeException("用户已存在");
        }else {
            userDao.addUser(user);
        }
    }
}
