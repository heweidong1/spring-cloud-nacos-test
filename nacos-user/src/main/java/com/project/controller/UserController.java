package com.project.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 需要视频资料或咨询课程的同学可以添加若曦老师的QQ:2746251334
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getUser/{string}",method = RequestMethod.GET)
    public String getUser(@PathVariable String string) throws InterruptedException {
        return "Hello Nacos Discovery " + string;
    }

}
