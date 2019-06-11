package com.hm.hmcar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hm.hmcar.entity.Listcar;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author bing
 * @since 2019-06-09
 */
public interface ListcarMapper extends BaseMapper<Listcar> {
    List<Listcar> selectById(Integer id);

}