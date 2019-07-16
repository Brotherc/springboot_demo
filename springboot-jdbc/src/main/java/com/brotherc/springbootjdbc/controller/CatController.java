package com.brotherc.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootjdbc.entity.Cat;
import com.brotherc.springbootjdbc.service.CatService;

@RestController
public class CatController {
	@Autowired
	private CatService catService;
	
	@RequestMapping("/cats")
	public Cat selectByCatName(String catName){
		return catService.selectByCatName(catName);
	}
}
