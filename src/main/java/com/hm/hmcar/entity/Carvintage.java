package com.hm.hmcar.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bing
 * @since 2019-06-09
 */
@TableName("carvintage")
public class Carvintage extends Model<Carvintage> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String vintage;
	private Integer vintageid;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVintage() {
		return vintage;
	}

	public void setVintage(String vintage) {
		this.vintage = vintage;
	}

	public Integer getVintageid() {
		return vintageid;
	}

	public void setVintageid(Integer vintageid) {
		this.vintageid = vintageid;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
