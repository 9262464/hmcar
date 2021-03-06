package com.hm.hmcar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hm.hmcar.dao.CarMapper;
import com.hm.hmcar.entity.Car;
import com.hm.hmcar.service.CarService;
import com.hm.hmcar.vo.VCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bing
 * @since 2019-06-06
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

    @Autowired(required = false)
    private CarMapper carMapper;


    @Override
    public List<VCat> selectName() {
        return carMapper.selectName();
    }

    @Override
    public void save(VCat vCat) {

        carMapper.save(vCat);
    }
}
