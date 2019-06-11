package com.hm.hmcar.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 闫冰冰
 * @since 2019-06-10
 */
@TableName("news")
public class News extends Model<News> {

    private static final long serialVersionUID = 1L;
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer tid;
	private String title;
	private String img;
	private Date date;
	private String name;
	private String source;
	private Integer typeid;
	private String span1;
	private String span2;
	private String span3;
	private String span4;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getSpan1() {
		return span1;
	}

	public void setSpan1(String span1) {
		this.span1 = span1;
	}

	public String getSpan2() {
		return span2;
	}

	public void setSpan2(String span2) {
		this.span2 = span2;
	}

	public String getSpan3() {
		return span3;
	}

	public void setSpan3(String span3) {
		this.span3 = span3;
	}

	public String getSpan4() {
		return span4;
	}

	public void setSpan4(String span4) {
		this.span4 = span4;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
