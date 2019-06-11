package com.hm.hmcar.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hm.hmcar.entity.Listcar;
import com.hm.hmcar.vo.CarVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

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

    @Select("select * from listcar where id=#{id}")
    List<Listcar> selectById(Integer id);

    @Select("select c.id,c.content, c.name,c.price,m.model,t.type,v.vintage from car c\n" +
            "\t\t\tINNER JOIN carmodel m\n" +
            "\t\t\ton c.modelid=m.modelid\n" +
            "\t\t\tINNER JOIN cartype t\n" +
            "\t\t\ton c.typeid = t.typeid\n" +
            "\t\t\tINNER JOIN carvintage v\n" +
            "\t\t\ton c.vintageid = v.vintageid\n" +
            "\t\t\twhere c.id=#{id}")
    List<CarVo> selectByCar(Integer id);

}