package com.hm.hmcar.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hm.hmcar.dao.CollectionMapper;
import com.hm.hmcar.entity.Coll;
import com.hm.hmcar.service.CollectionService;
import com.hm.hmcar.vo.Vsales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 闫冰冰
 * @since 2019-06-10
 */
@Service
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Coll> implements CollectionService {

    @Autowired
    private CollectionMapper collectionMapper;
    @Override
    public Vsales list(Integer sid) {

        return collectionMapper.listColl(sid);
    }
}
