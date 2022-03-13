package com.xiaobai.controller;

import com.xiaobai.config.PatternProperties;
import com.xiaobai.pojo.User;
import com.xiaobai.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-11 下午 23:33
 * @program demo
 * @Version 1.0
 * @ClassName UserController
 * @Description 类方法说明：$
 */
@Slf4j
@RestController
@RequestMapping("/user")
//@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    //@Value("${pattern.dateformat}")
    //private String dateformat;

    @Autowired
    private PatternProperties patternProperties;

    @GetMapping("/now")
    public String now(){
        // 格式化时间
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateformat()));
    }

    @GetMapping("/prop")
    public PatternProperties prop(){
        return patternProperties;
    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id,@RequestHeader("sign") String sign) {
        System.out.println(sign);
        return userService.queryById(id);
    }
}
