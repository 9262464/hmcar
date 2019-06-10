package com.hm.hmcar.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hm.hmcar.entity.News;
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
public interface NewsMapper extends BaseMapper<News> {

    @Select("SELECT n.* from news n \n" +
            "join news s on s.typeid = n.tid\n" +
            "where s.typeid = #{typeid}")
    List<News> selectAll(@Param("typeid") Integer id);

    @Select("SELECT n.* from news n \n" +
            "where n.id = #{id}")
    News select(@Param("id") Integer id);

    @Select("SELECT * from news where title like '%'#{title}'%'")
    News selectll(@Param("title")String title);

}