package com.hm.hmcar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hm.hmcar.entity.Car;
import com.hm.hmcar.entity.Cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author bing
 * @since 2019-06-12
 */
public interface CartMapper extends BaseMapper<Cart> {
    @Select("select c.`name`,c.price from cart t \n" +
            "INNER JOIN car c\n" +
            "ON c.id=t.carid\n" +
            "where t.id = #{id}")
    List<Car> selectByid(Integer id);

    @Insert("insert into cart (carid) VALUE (#{id})")
    void add(Integer id);

    @Delete("delete FROM cart where carid = #{id}")
    void delete(Integer id);
}