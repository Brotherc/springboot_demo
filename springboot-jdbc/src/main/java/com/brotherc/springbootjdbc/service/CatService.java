package com.brotherc.springbootjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brotherc.springbootjdbc.dao.CatDao;
import com.brotherc.springbootjdbc.entity.Cat;


@Service
public class CatService {
	@Autowired
	private CatDao catDao;
	
	public Cat selectByCatName(String catName){
		return catDao.selectByCatName(catName);
	}
}
