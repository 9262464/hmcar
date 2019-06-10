package com.hm.hmcar.service;

import com.hm.hmcar.entity.Car;
import com.baomidou.mybatisplus.service.IService;
import com.hm.hmcar.vo.VCat;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bing
 * @since 2019-06-06
 */
public interface CarService extends IService<Car> {
    List<VCat> selectName();
public void save(VCat vCat);

}
