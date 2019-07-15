package com.brotherc.springbootvalid.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brotherc.springbootvalid.entity.Cat;
import com.brotherc.springbootvalid.repository.CatRepository;

@Service
public class CatService {
	@Autowired
	private CatRepository catRepository;
	
	/**
	 * save,update ,delete 方法需要绑定事务.
	 * 使用@Transactional进行事务的绑定.
	 * @param cat
	 */
	
	//保存数据.
	@Transactional
	public void save(Cat cat){
		catRepository.save(cat);
	}
}
