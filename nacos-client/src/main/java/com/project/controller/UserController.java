package com.project.controller;

//import com.feign.UserServiceFeign;
import com.project.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class UserController {

    @Autowired
    UserServiceFeign userServiceFeign;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/test.do1/{string}",method = RequestMethod.GET)
    public Object getUser(@PathVariable String string) throws InterruptedException {
        return restTemplate.getForObject("http://nacos-user/user/getUser/"+string,String.class);
    }

    @RequestMapping(value = "/test.do2/{string}",method = RequestMethod.GET)
    public Object getUser2(@PathVariable String string) throws InterruptedException {
        return userServiceFeign.getUser(string);
    }
}
