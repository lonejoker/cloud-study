package com.xiaobai.clients;


import com.xiaobai.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(value="userServer", configuration = DefaultFeignConfiguration.class)
@FeignClient(value="userServer")
public interface UserClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
