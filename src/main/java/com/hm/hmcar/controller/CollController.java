package com.hm.hmcar.controller;

import com.hm.hmcar.entity.Coll;
import com.hm.hmcar.service.CollectionService;
import com.hm.hmcar.vo.JsonBean;
import com.hm.hmcar.vo.Vsales;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "收藏",tags = "用户收藏信息")
public class CollController {
    @Autowired
    private CollectionService collectionService;


    @PostMapping("coll.do")
    @ApiOperation(value = "添加收藏",notes= "添加收藏")
    public JsonBean save(Coll collection){
        collectionService.save(collection);
        return JsonBean.setOK("成功",null);
    }
    @GetMapping("colllist.do")
    @ApiOperation(value = "查看收藏",notes= "查看收藏详情")
    public JsonBean list(Integer sid){
        Vsales list = collectionService.list(sid);
       return  JsonBean.setOK("OK",list);

    }
}
