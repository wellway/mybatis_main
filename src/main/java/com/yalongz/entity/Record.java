package com.yalongz.entity;

import java.io.Serializable;

/**
 * 记录更新时间
 * 
 * @author yalongz
 *
 */
public class Record implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private  String				type;
	private String				date;

	public Record(String type) {
		this.type = type;
	}

	public Record(String type, String date) {
		this.type = type;
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
