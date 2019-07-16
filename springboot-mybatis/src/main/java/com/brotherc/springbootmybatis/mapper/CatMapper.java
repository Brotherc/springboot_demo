package com.brotherc.springbootmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.brotherc.springbootmybatis.entity.Cat;

/**
 * @author: Brotherc
 * @date: 2019/7/16 10:50
 */
public interface CatMapper {
    @Select("select * from cat where cat_name = #{catName}")
    public List<Cat> findByCatName(@Param("catName") String catName);

    @Insert("insert into cat(id,cat_age,cat_name) values(#{id},#{catAge},#{catName})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public void save(Cat cat);

/*    public List<Cat> findByCatName(String catName);*/
}
