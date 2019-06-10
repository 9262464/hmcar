package com.hm.hmcar.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author bing
 * @since 2019-06-09
 */
@TableName("listcar")
public class Listcar extends Model<Listcar> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String carimgurl;
	private String pricemin;
	private String pricemax;
	private String content;
	private String carname;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarimgurl() {
		return carimgurl;
	}

	public void setCarimgurl(String carimgurl) {
		this.carimgurl = carimgurl;
	}

	public String getPricemin() {
		return pricemin;
	}

	public void setPricemin(String pricemin) {
		this.pricemin = pricemin;
	}

	public String getPricemax() {
		return pricemax;
	}

	public void setPricemax(String pricemax) {
		this.pricemax = pricemax;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
