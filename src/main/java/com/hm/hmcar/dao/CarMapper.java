package com.hm.hmcar.dao;

import com.hm.hmcar.entity.Car;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hm.hmcar.vo.VCat;
import org.apache.ibatis.annotations.Select;

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

   @Select("select c.*,m.model,t.type,v.vintage from car c\n" +
           "\tINNER JOIN carmodel m\n" +
           "\ton c.modelid=m.modelid\n" +
           "\tINNER JOIN cartype t\n" +
           "\ton c.typeid = t.typeid\n" +
           "\tINNER JOIN carvintage v\n" +
           "\ton c.vintageid = v.vintageid")
   List<VCat> selectName();

   void save(VCat cat);
}