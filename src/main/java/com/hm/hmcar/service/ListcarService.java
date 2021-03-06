package com.hm.hmcar.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hm.hmcar.entity.Listcar;
import com.hm.hmcar.vo.CarVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bing
 * @since 2019-06-09
 */
public interface ListcarService extends IService<Listcar> {
    List<Listcar> selectById(Integer id);

    List<CarVo> selectByCar(Integer id);
}
