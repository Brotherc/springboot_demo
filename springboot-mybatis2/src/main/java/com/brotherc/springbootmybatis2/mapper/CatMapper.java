package com.brotherc.springbootmybatis2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.brotherc.springbootmybatis2.entity.Cat;

/**
 * @author: Brotherc
 * @date: 2019/7/16 10:50
 */
@Mapper
public interface CatMapper {
    public List<Cat> findByCatName(String catName);
}
