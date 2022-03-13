package com.xiaobai.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 下午 15:46
 * @program demo
 * @Version 1.0
 * @ClassName DefaultFeignConfiguration
 * @Description 类方法说明：$
 */
public class DefaultFeignConfiguration  {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC; // 日志级别为BASIC
    }
}