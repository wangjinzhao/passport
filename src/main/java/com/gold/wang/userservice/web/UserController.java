package com.gold.wang.userservice.web;

import com.gold.wang.userservice.domain.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @RequestMapping(value = "/validate/", method = RequestMethod.GET)
    public User findById(@RequestParam("id") Long id){
        System.out.println("请求进来!");
        User result = new User(id,"gold.wang","gold.wang");
        return result;
    }
}
