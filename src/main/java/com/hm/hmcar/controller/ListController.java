package com.hm.hmcar.controller;

import com.hm.hmcar.entity.Listcar;
import com.hm.hmcar.service.ListcarService;
import com.hm.hmcar.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(value = "买车车辆展示",tags = "买车车辆展示")
public class ListController {
    @Autowired
    private ListcarService listcarService;

    @GetMapping("/list.do")
    @ApiOperation(value = "车辆展示",notes = "车辆展示")
    public JsonBean selectById(Integer id){
        Listcar listcar = listcarService.getById(id);

        return  JsonBean.setOK("成功",listcar);
    }
}
