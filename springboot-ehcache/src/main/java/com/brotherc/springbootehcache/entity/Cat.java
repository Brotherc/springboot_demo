package com.brotherc.springbootehcache.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat implements Serializable {
    private static final long serialVersionUID = 1L;
	/**
	 * 使用@Id指定主键.
	 * 
	 * 使用代码@GeneratedValue(strategy=GenerationType.AUTO)
	 * 指定主键的生成策略，mysql默认的是自增长。
	 * 
	 */
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;//主键.
	private String catName;//姓名. cat_name
	private Integer catAge;//年龄. cat_age;
}
