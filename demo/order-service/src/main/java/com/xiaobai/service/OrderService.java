package com.xiaobai.service;

import com.xiaobai.mapper.OrderMapper;
import com.xiaobai.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 4.返回
        return order;
    }
}