package com.brotherc.springbootvalid.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootvalid.entity.Cat;
import com.brotherc.springbootvalid.service.CatService;

@RestController
public class CatController {
	
	@Autowired
	private CatService catService;
	
	@PostMapping("/cats")
	public String save(@Valid Cat cat, BindingResult bindingResult){
	    if (bindingResult.hasErrors()) {
	        System.out.println(bindingResult.getFieldError().getDefaultMessage());
	        return null;
        }
		catService.save(cat);
		return "save ok.";
	}
}
