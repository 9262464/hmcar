package com.hm.hmcar.service.impl;

import com.hm.hmcar.entity.Listcar;
import com.hm.hmcar.dao.ListcarMapper;
import com.hm.hmcar.service.ListcarService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bing
 * @since 2019-06-09
 */
@Service
public class ListcarServiceImpl extends ServiceImpl<ListcarMapper, Listcar> implements ListcarService {


    @Autowired
    private ListcarMapper listcarDao;
    @Override
    public List<Listcar> seectById(Integer id) {
        List<Listcar> listcars = listcarDao.selectById(id);
        return listcars;
    }
}
