package com.brotherc.springbootmybatis2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootmybatis2.entity.Cat;
import com.brotherc.springbootmybatis2.service.CatService;


@RestController
public class CatController {
	@Autowired
	private CatService catService;
	
	@RequestMapping("/cats")
	public List<Cat> selectByCatName(String catName){
		return catService.findByCatName(catName);
	}

}
