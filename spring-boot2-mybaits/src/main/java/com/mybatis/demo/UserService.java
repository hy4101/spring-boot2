package com.mybatis.demo;

import com.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @className: UserService
 * @package: com.mybatis.demo
 * @author: admin
 * @date: 2019/12/14 14:37
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试新增、修改、查询
     *
     * @param user
     */
    public void test(User user) {
        userMapper.install(user);
        user.setName("update_name");
        userMapper.update(user);
        user = userMapper.get(user.getId());
        System.out.println(user.toString());
        List<User> users = userMapper.search();
        System.out.println(users.size());
    }

    /**
     * 测试删除
     *
     * @param id
     */
    public void delete(String id) {
        userMapper.delete(id);
    }

}