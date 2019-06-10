package com.hm.hmcar.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hm.hmcar.entity.Coll;
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
public interface CollectionMapper extends BaseMapper<Coll> {

    @Select("SELECT s.* ,c.* from supplies s\n" +
            "join collection c on s.sid = #{sid}")
Vsales listColl(@Param("sid") Integer sid);
}