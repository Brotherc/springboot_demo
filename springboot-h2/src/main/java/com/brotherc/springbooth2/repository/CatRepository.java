package com.brotherc.springbooth2.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.brotherc.springbooth2.entity.Cat;

/**
 * @author: Brotherc
 * @date: 2019/7/15 14:16
 */
public interface CatRepository extends JpaRepository<Cat, Integer> {
}
