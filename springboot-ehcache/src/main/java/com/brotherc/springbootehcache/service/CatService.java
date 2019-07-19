package com.brotherc.springbootehcache.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.brotherc.springbootehcache.entity.Cat;
import com.brotherc.springbootehcache.repository.CatRepository;

@Service
@CacheConfig(cacheNames = "cache")
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
	
	//删除数据.
	@Transactional
    @CacheEvict(key = "#p0")
	public void deleteById(Integer id){
        System.out.println("删除功能，删除缓存，直接写库, id=" + id);
        catRepository.deleteById(id);
	}

    //更新数据.
    @Transactional
    @CachePut(key = "#p0")
    public void updateById(Integer id, String name, Integer age){
        System.out.println("更新功能，更新缓存，直接写库, id=" + id);
	    Cat cat = new Cat(id, name, age);
	    cat.setId(id);
        catRepository.save(cat);
    }

    //查询数据.
    @Cacheable(key = "#p0")
    public Cat getOne(Integer id){
        System.out.println("查询功能，缓存找不到，直接读库, id=" + id);
	    return catRepository.getOne(id);
    }
}
