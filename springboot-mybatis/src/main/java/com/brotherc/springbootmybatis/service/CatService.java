package com.brotherc.springbootmybatis.service;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brotherc.springbootmybatis.entity.Cat;
import com.brotherc.springbootmybatis.mapper.CatMapper;
import com.github.pagehelper.PageHelper;


@Service
public class CatService {
	@Resource
	private CatMapper catMapper;
	
	public List<Cat> findByCatName(String catName){
        PageHelper.startPage(1,1);
	    return catMapper.findByCatName(catName);
	}

	@Transactional
    public void save(Cat cat){
        catMapper.save(cat);
    }
}
