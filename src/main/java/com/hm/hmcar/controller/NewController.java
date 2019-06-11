package com.hm.hmcar.controller;

import com.hm.hmcar.entity.News;
import com.hm.hmcar.service.NewsService;
import com.hm.hmcar.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "全部资讯",tags = "资讯信息展示")
public class NewController {
    @Autowired
    private NewsService newsService;

    @GetMapping("news.do")
    @ApiOperation(value = "展示信息",notes = "展示资讯")
    public JsonBean listAll(){
        List<News> news = newsService.list();
        return JsonBean.setOK("ok",news);

    }
    @GetMapping("new.do")
    @ApiOperation(value = "展示信息",notes = "展示资讯")
    public JsonBean list(Integer id){
        List<News> list = newsService.selectAll(id);
        return JsonBean.setOK("ok",list);

    }
    @GetMapping("newlist.do")
    @ApiOperation(value = "展示详情",notes = "展示资讯详情")
    public JsonBean listNew(Integer id){
        News news = newsService.select(id);
        return JsonBean.setOK("ok",news);

    }
    @GetMapping("newslist.do")
    @ApiOperation(value = "查询详情",notes = "查询资讯详情")
    public JsonBean listNew(String title){
        News news = newsService.select(title);
        return JsonBean.setOK("ok",news);

    }

}

