package com.brotherc.springbootjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.brotherc.springbootjdbc.entity.Cat;

@Repository
public class CatDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Cat selectByCatName(String catName){
		
		/**
		 * 1、定义一个Sql语句；
		 * 2、定义一个RowMapper.
		 * 3、执行查询方法.
		 */
		String sql = "select *from cat where cat_name=?";
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
		Cat cat = jdbcTemplate.queryForObject(sql, new Object[]{catName}, rowMapper);
		
		return cat;
	}
	
}
