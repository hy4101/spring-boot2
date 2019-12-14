package com.mybatis.demo;

import com.mybatis.mapper.UserMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * 〈功能概述〉<br>
 *
 * @className: UserController
 * @package: com.mybatis.demo
 * @author: admin
 * @date: 2019/12/14 14:47
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("name");
        user.setUserType(1);
        userService.test(user);
        return "success";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable(value = "id") String id) {
        userService.delete(id);
        return "success";
    }

}