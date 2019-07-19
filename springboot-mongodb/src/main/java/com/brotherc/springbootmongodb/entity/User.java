/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.brotherc.springbootmongodb.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private String id;
	private String name;
	private Date createTime;

	public String toString() {
		return "RoncooUser [id=" + id + ", name=" + name + ", createTime=" + createTime + "]";
	}

}
