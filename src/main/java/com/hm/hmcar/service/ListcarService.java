package com.hm.hmcar.service;

import com.hm.hmcar.entity.Listcar;
import com.baomidou.mybatisplus.service.IService;

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
	List<Listcar> seectById(Integer id);
}
