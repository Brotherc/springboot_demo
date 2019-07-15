package com.brotherc.springbootaop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brotherc.springbootaop.entity.Cat;
import com.brotherc.springbootaop.service.CatService;


@RestController
public class CatController {
    private static final Logger logger = LoggerFactory.getLogger(CatController.class);

    @Autowired
	private CatService catService;
	
	@PostMapping("/cats")
	public String save(Cat cat){
	    logger.info("save()");
		catService.save(cat);
		return "save ok.";
	}
}
