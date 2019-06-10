package com.hm.hmcar.service;

import com.baomidou.mybatisplus.service.IService;
import com.hm.hmcar.entity.Coll;
import com.hm.hmcar.vo.Vsales;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 闫冰冰
 * @since 2019-06-10
 */
public interface CollectionService extends IService<Coll> {
    public Vsales list(Integer sid);

	
}
