package com.hm.hmcar.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hm.hmcar.dao.CartMapper;
import com.hm.hmcar.entity.Car;
import com.hm.hmcar.entity.Cart;
import com.hm.hmcar.service.CartService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bing
 * @since 2019-06-12
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {

    @Autowired
    private CartMapper carDao;

    @Override
    public List<Car> selectByid(Integer id) {
        List<Car> list = carDao.selectByid(id);
        return list;
    }

    @Override
    public void add(Integer id) {
        carDao.add(id);

    }

    @Override
    public void delete(Integer id) {

        carDao.delete(id);
    }
}
