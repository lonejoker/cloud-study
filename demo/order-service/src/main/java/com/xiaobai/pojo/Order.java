package com.xiaobai.pojo;

import lombok.Data;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-11 下午 23:37
 * @program demo
 * @Version 1.0
 * @ClassName Order
 * @Description 类方法说明：$
 */
@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private User user;
}
