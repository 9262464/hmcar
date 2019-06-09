package com.hm.hmcar.service.impl;

import com.hm.hmcar.dao.CarMapper;
import com.hm.hmcar.entity.Car;
import com.hm.hmcar.service.CarService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
	
}
