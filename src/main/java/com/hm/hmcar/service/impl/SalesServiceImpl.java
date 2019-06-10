package com.hm.hmcar.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hm.hmcar.dao.SalesMapper;
import com.hm.hmcar.entity.Sales;
import com.hm.hmcar.service.SalesService;
import com.hm.hmcar.vo.Vsales;
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
public class SalesServiceImpl extends ServiceImpl<SalesMapper, Sales> implements SalesService {

    @Autowired
    private SalesMapper salesMapper;
    @Override
    public List<Vsales> selectName(Integer sid) {

        return  salesMapper.selectName(sid);
    }
}
