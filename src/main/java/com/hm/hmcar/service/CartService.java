package com.hm.hmcar.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hm.hmcar.entity.Car;
import com.hm.hmcar.entity.Cart;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bing
 * @since 2019-06-12
 */
public interface CartService extends IService<Cart> {

    List<Car> selectByid(Integer id);

   void add(Integer id);

    void delete(Integer id);
}
