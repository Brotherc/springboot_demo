package com.brotherc.springbootvalid.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat {
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

    @Min(value = 20, message = "年龄不能小于20")
	private Integer catAge;//年龄. cat_age;
}
