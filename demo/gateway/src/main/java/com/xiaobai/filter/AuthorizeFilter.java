package com.xiaobai.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 下午 19:34
 * @program demo
 * @Version 1.0
 * @ClassName AuthorizeFilter
 * @Description 类方法说明：$
 */
@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {

    // 测试：http://localhost:10010/order/101?authorization=admin
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 获取第一个 authorization 参数
        String authorization = exchange.getRequest().getQueryParams().getFirst("authorization");
        if ("admin".equals(authorization)){
            // 放行
            return chain.filter(exchange);
        }
        // 设置拦截状态码信息
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        // 设置拦截
        return exchange.getResponse().setComplete();
    }

    // 设置过滤器优先级，值越低优先级越高
    // 也可以使用 @Order 注解
    @Override
    public int getOrder() {
        return -1;
    }
}
