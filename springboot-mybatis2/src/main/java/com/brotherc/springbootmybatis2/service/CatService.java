package com.brotherc.springbootmybatis2.service;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.brotherc.springbootmybatis2.entity.Cat;
import com.brotherc.springbootmybatis2.mapper.CatMapper;


@Service
public class CatService {
	@Resource
	private CatMapper catMapper;
	
	public List<Cat> findByCatName(String catName){
	    return catMapper.findByCatName(catName);
	}
}
