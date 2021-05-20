package com.project.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("nacos-user")
@RequestMapping("/user")
public interface UserServiceFeign {

    @RequestMapping(value = "/getUser/{string}",method = RequestMethod.GET)
    public String getUser(@PathVariable String string) throws InterruptedException;
}
