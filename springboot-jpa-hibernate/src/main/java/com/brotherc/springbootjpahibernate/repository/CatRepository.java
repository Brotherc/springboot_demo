package com.brotherc.springbootjpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brotherc.springbootjpahibernate.entity.Cat;

/**
 * @author: Brotherc
 * @date: 2019/7/15 14:16
 */
public interface CatRepository extends JpaRepository<Cat, Integer> {
}
