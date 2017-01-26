package net.saltfactory.demo.springboot.controllers;


import net.saltfactory.demo.springboot.models.User;
import net.saltfactory.demo.springboot.models.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by saltfactory on 26/01/2017.
 */
@RestController
public class GreetingController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        User user = userMapper.findUser(name);
        return "Hello, " + user.getName() + "!";
    }
}
