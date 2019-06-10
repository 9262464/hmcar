package com.hm.hmcar.service;

import com.baomidou.mybatisplus.service.IService;
import com.hm.hmcar.entity.Sales;
import com.hm.hmcar.vo.Vsales;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 闫冰冰
 * @since 2019-06-10
 */
public interface SalesService extends IService<Sales> {

    List<Vsales> selectName(@Param("sid") Integer sid);
	
}
