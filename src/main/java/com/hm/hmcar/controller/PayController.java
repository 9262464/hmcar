package com.hm.hmcar.controller;

import com.hm.hmcar.service.CarService;
import com.hm.hmcar.vo.JsonBean;
import com.hm.hmcar.vo.VCat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "在线评估",tags = "评估")

public class PayController {

    @Autowired
    private CarService carService;

    @GetMapping("caror.do")
    @ApiOperation(value = "买车啦",notes = "买车啊")
    public JsonBean selectName() {
        List<VCat> list = carService.selectName();
        return JsonBean.setOK("成功",list);
    }
    @PostMapping("paycar.do")

    public JsonBean save(VCat cat) {
        carService.save(cat);
       return JsonBean.setOK("成功",null);

    }

}
