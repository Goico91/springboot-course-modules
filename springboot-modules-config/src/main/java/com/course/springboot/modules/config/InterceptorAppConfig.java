package com.course.springboot.modules.config;

import com.course.springboot.modules.commons.ConstantsUrl;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorAppConfig implements WebMvcConfigurer {

    private final TokenInterceptor tokenInterceptor;

    public InterceptorAppConfig(TokenInterceptor tokenInterceptor) {
        this.tokenInterceptor = tokenInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(tokenInterceptor).addPathPatterns(ConstantsUrl.API_EMPLOYEES, ConstantsUrl.API_EMPLOYEES + ConstantsUrl.ID);
    }
}
