package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //1.定义MP拦截器(空壳子)
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //2.添加具体拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());//分页拦截器
        return interceptor;
    }//交给spring管理的MP的拦截器
}
