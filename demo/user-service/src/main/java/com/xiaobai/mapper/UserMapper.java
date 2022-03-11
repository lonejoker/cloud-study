package com.xiaobai.mapper;

import com.xiaobai.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-11 下午 23:32
 * @program demo
 * @Version 1.0
 * @ClassName UserMapper
 * @Description 类方法说明：$
 */
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    User findById(@Param("id") Long id);
}
