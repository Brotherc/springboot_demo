package com.brotherc.springbootmongodb.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.brotherc.springbootmongodb.entity.User;


public interface UserRepository extends MongoRepository<User, String>{

	User findByName(String string);
	
	User findByNameAndId(String string, String id);

	Page<User> findByName(String name, Pageable pageable);
}
