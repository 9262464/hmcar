package com.hm.hmcar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hm.hmcar.dao.CartMapper;
import com.hm.hmcar.entity.Cart;
import com.hm.hmcar.service.CartService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bing
 * @since 2019-06-10
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {
	
}
