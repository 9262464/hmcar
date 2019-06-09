package com.hm.hmcar.dao;

import com.hm.hmcar.entity.Car;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.io.Serializable;
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

   List<Car> selectBy();
}