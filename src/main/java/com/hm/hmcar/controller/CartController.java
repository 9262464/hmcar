package com.hm.hmcar.controller;

import com.hm.hmcar.service.CartService;
import com.hm.hmcar.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

}
