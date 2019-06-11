package com.hm.hmcar.controller;

import com.hm.hmcar.service.SalesService;
import com.hm.hmcar.vo.JsonBean;
import com.hm.hmcar.vo.Vsales;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "查看商品信息",tags = "查看商品信息")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("sales.do")
    @ApiOperation(value = "商品信息展示",notes = "商品信息展示")

    public JsonBean select(Integer sid) {
        List<Vsales> vsales = salesService.selectName(sid);
        return JsonBean.setOK("OK",vsales);
    }
}
