package com.hm.hmcar.dao;

import com.hm.hmcar.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    //登陆
    @Select("select * from user where phone=#{phone}")
    public User login(String phone);

    //根据用户名密码进行 注册 添加用post
    @Insert("insert into user(phone,password,flag) values(#{phone},#{password},1)")
    public void  addUser(User user);

}
