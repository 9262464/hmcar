package com.hm.hmcar.controller;

import com.hm.hmcar.entity.User;
import com.hm.hmcar.service.UserService;
import com.hm.hmcar.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
@Api(value = "用户登录信息",tags = "用户登录信息")
public class UserController {
    @Autowired
    private UserService userService;


    //登录
    @ApiOperation(value = "用户登录",notes = "用户登录")
    @PostMapping("/user/login.do")
    public JsonBean login(@ApiParam(value = "手机",name = "phone") String phone,@ApiParam(value = "密码",name = "password") String password, HttpSession session){
        User user= userService.login(phone,password);
        session.setAttribute("user",user);
        return JsonBean.setOK("登陆成功",user);
    }
    //注册
    @ApiOperation(value = "用户注册",notes = "用户注册")
    @PostMapping("/user/add.do")
    public JsonBean zhuce(@ApiParam(name = "user",value = "用户相关的键值对") User user,HttpSession session){
        userService.zhuce(user);

        session.setAttribute("user",user);
        return JsonBean.setOK("注册成功",user);
    }
}
