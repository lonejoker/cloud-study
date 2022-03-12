package com.xiaobai.service;

import com.xiaobai.mapper.OrderMapper;
import com.xiaobai.pojo.Order;
import com.xiaobai.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-11 下午 23:37
 * @program demo
 * @Version 1.0
 * @ClassName OrderService
 * @Description 类方法说明：$
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.利用RestTemplate发起http请求，查询用户
        // 2.1url路径
        //String url = "http://localhost:8081/user/"+order.getUserId();
        String url = "http://userServer/user/"+order.getUserId();
        // 2.2发起http请求，实现远程调用
        User user = restTemplate.getForObject(url, User.class);
        // 3.封装user到order
        order.setUser(user);
        // 4.返回
        return order;
    }
}