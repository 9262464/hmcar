package com.hm.hmcar.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hm.hmcar.dao.CarMapper;
import com.hm.hmcar.dao.ListcarMapper;
import com.hm.hmcar.entity.Listcar;
import com.hm.hmcar.service.ListcarService;
import com.hm.hmcar.vo.CarVo;
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
    private ListcarMapper listcarMapper;

    @Override
    public List<Listcar> selectById(Integer id) {
        List<Listcar> listcars = listcarMapper.selectById(id);
        return listcars;
    }

    @Override
    public List<CarVo> selectByCar(Integer id) {
        List<CarVo> list = listcarMapper.selectByCar(id);
        return list;
    }


}
