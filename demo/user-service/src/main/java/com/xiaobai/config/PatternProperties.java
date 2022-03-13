package com.xiaobai.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 上午 8:54
 * @program demo
 * @Version 1.0
 * @ClassName PatternProperties
 * @Description 类方法说明：$
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    public String dateformat;
}