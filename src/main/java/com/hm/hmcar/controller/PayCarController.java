package com.hm.hmcar.controller;

import com.hm.hmcar.entity.Paycar;
import com.hm.hmcar.service.PaycarService;
import com.hm.hmcar.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "卖车",tags = "卖车")
public class PayCarController {
    @Autowired
    private PaycarService paycarService;

    @PostMapping("rep.do")
    @ApiOperation(value = "卖车啦",notes = "卖车啊")
    public JsonBean save(Paycar paycar){
        paycarService.save(paycar);
        return JsonBean.setOK("成功",null);
    }
}
