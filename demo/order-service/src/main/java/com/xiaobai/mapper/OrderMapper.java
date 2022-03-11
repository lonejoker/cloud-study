package com.xiaobai.mapper;

import com.xiaobai.pojo.Order;
import org.apache.ibatis.annotations.Select;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-11 下午 23:37
 * @program demo
 * @Version 1.0
 * @ClassName OrderMapper
 * @Description 类方法说明：$
 */
public interface OrderMapper {

    @Select("select * from tb_order where id = #{id}")
    Order findById(Long id);
}
