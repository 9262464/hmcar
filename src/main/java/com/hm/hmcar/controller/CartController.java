package com.hm.hmcar.controller;


import com.hm.hmcar.entity.Car;
import com.hm.hmcar.service.CartService;
import com.hm.hmcar.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "购物车操作",tags = "购物车操作")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/listcart.do")
    @ApiOperation(value = "购物车展示",notes = "购物车展示")
    public JsonBean select(Integer id){
        List<Car> list = cartService.selectByid(id);
        return JsonBean.setOK("成功",list);
    }

    @GetMapping("/add.do")
    @ApiOperation(value = "加入购物车",notes = "加入购物车")
    public JsonBean addCar(Integer id) {
        cartService.add(id);
        return JsonBean.setOK("成功", null);
    }

    @DeleteMapping("/delete.do")
    @ApiOperation(value = "删除购物车",notes = "删除购物车")
    public JsonBean delete(Integer id) {
        cartService.delete(id);
        return JsonBean.setOK("成功", null);
    }
}
