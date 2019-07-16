package com.brotherc.springbootmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootmybatis.entity.Cat;
import com.brotherc.springbootmybatis.service.CatService;


@RestController
public class CatController {
	@Autowired
	private CatService catService;
	
	@RequestMapping("/cats")
	public List<Cat> selectByCatName(String catName){
		return catService.findByCatName(catName);
	}

	@PostMapping("/cats")
    public void save(Cat cat) {
	    catService.save(cat);
    }
}
