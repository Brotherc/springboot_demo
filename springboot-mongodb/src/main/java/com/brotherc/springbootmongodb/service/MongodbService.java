package com.brotherc.springbootmongodb.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.brotherc.springbootmongodb.entity.User;
import com.brotherc.springbootmongodb.repository.UserRepository;

@Service
public class MongodbService {
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
    private UserRepository userRepository;

	public void insert(User user) {
	    user.setCreateTime(new Date());
		mongoTemplate.insert(user);
	}

	public void deleteById(String id) {
		Criteria criteria = Criteria.where("id").in(id);
		Query query = new Query(criteria);
		mongoTemplate.remove(query, User.class);
	}
	
	public void updateById(User user) {
		Criteria criteria = Criteria.where("id").in(user.getId());
		Query query = new Query(criteria);
		Update update = new Update();
		update.set("name", user.getName());
		update.set("createTime", user.getCreateTime());
		mongoTemplate.updateMulti(query, update, User.class);
	}
	
	public User selectById(String id) {
		Criteria criteria = Criteria.where("id").in(id);
		Query query = new Query(criteria);
		return mongoTemplate.findOne(query, User.class);
	}

	public User getUserByName(String name) {
	    return userRepository.findByName(name);
    }

    public User getUserByNameAndId(String name, String id) {
	    return userRepository.findByNameAndId(name, id);
    }
}
