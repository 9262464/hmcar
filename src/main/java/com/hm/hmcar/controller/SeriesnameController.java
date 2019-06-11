package com.hm.hmcar.controller;

import com.hm.hmcar.entity.Seriesname;
import com.hm.hmcar.service.SeriesnameService;
import com.hm.hmcar.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.util.List;

@RestController
@Api(value = "卖车车辆展示",tags = "卖车车辆展示")
public class SeriesnameController {
    @Autowired
    private SeriesnameService seriesnameService;

    @GetMapping("carxing.do")
    @ApiOperation(value = "型号展示",notes = "型号展示")
    public JsonBean selectName() {
//        QueryWrapper<Seriesname> queryWrapper=new QueryWrapper<>();

        List<Seriesname> list = seriesnameService.list();
        return JsonBean.setOK("OK",list);
    }
}
