package com.hm.hmcar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hm.hmcar.entity.Sales;
import com.hm.hmcar.vo.Vsales;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author 闫冰冰
 * @since 2019-06-10
 */
public interface SalesMapper extends BaseMapper<Sales> {


    @Select("SELECT s.* ,a.* from supplies s\n" +
            "join sales a on s.sid = #{sid}")
    List<Vsales> selectName(@Param("sid") Integer sid);

}