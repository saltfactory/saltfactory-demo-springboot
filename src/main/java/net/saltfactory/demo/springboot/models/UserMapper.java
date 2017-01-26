package net.saltfactory.demo.springboot.models;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by saltfactory on 26/01/2017.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE name = #{name}")
    public User findUser(@Param("name") String name);
}
