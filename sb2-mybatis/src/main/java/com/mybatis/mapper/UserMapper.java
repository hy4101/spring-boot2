package com.mybatis.mapper;

import com.mybatis.demo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @className: UserMapper
 * @package: com.mybatis.demo
 * @author: admin
 * @date: 2019/12/14 14:38
 */
public interface UserMapper {

    @Insert("insert into user(id,name) values(#{id},#{name})")
    void install(User user);

    @Update("update user set name=#{name} where id=#{id}")
    void update(User user);

    @Select("select * from user where id=#{id}")
    @Results({
            @Result(property = "userType", column = "user_type")
    })
    User get(String id);

    @Select("select * from user")
    @Results({
            @Result(property = "userType", column = "user_type")
    })
    List<User> search();

    @Delete("delete from user where id=#{id}")
    void delete(String id);

}