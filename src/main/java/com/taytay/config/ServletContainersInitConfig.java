package com.taytay.config;


import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //乱码过滤
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }

}

//
//    //加载容器配置
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMCVConfig.class);
//        return ctx;
//    }
//    //设置哪些请求需要SpringMVC处理
//    @Override
//    protected String[] getServletMappings() { return new String[]{"/"}; }
//
//    //加载Spring容器配置
//    @Override
//    protected WebApplicationContext createRootApplicationContext(){
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringConfig.class);
//        return ctx;
//    }
