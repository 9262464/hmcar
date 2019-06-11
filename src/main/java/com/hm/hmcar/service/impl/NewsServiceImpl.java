package com.hm.hmcar.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hm.hmcar.dao.NewsMapper;
import com.hm.hmcar.entity.News;
import com.hm.hmcar.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 闫冰冰
 * @since 2019-06-10
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

@Autowired
private NewsMapper mapper;

    @Override
    public News select(String title) {
        return mapper.selectll(title);
    }

    @Override
    public List<News> selectAll(Integer id) {

        return mapper.selectAll(id);
    }

    @Override
    public News select(Integer id) {
        return mapper.select(id);
    }
}
