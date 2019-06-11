package com.hm.hmcar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hm.hmcar.entity.Car;
import com.hm.hmcar.vo.VCat;

import java.util.List;


/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author bing
 * @since 2019-06-06
 */
public interface CarMapper extends BaseMapper<Car> {

    List<VCat> selectName();

    public void save(VCat vCat);

}