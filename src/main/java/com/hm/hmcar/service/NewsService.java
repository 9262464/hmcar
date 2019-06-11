package com.hm.hmcar.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hm.hmcar.entity.News;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 闫冰冰
 * @since 2019-06-10
 */
public interface NewsService extends IService<News> {

    List<News> selectAll(Integer id);


    News select(Integer id);
    News select(String title);

}
