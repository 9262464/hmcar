package com.hm.hmcar.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hm.hmcar.entity.Seriesname;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author bing
 * @since 2019-06-09
 */
public interface SeriesnameMapper extends BaseMapper<Seriesname> {
    @Override
    List<Seriesname> selectList(Wrapper<Seriesname> wrapper);
}