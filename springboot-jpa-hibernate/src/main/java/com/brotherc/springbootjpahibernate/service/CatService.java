package com.brotherc.springbootjpahibernate.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brotherc.springbootjpahibernate.entity.Cat;
import com.brotherc.springbootjpahibernate.repository.Cat2Repository;
import com.brotherc.springbootjpahibernate.repository.CatRepository;

@Service
public class CatService {
	@Autowired
	private CatRepository catRepository;
    @Autowired
    private Cat2Repository cat2Repository;
	
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
	
	//删除数据.
	@Transactional
	public void deleteById(Integer id){
		catRepository.deleteById(id);
	}

    //更新数据.
    @Transactional
    public void updateById(Integer id, String name, Integer age){
	    Cat cat = new Cat(id, name, age);
	    cat.setId(id);
        catRepository.save(cat);
    }
	
	//查询数据.
	public List<Cat> getAll(){
		return catRepository.findAll();
	}

    //查询数据.
    public Cat getOne(Integer id){
        return catRepository.getOne(id);
    }

    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }


    public Cat findByCatName2(String catName){
        return cat2Repository.findByCatName(catName);
    }
}
