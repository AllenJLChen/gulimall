package com.atguigu.gulimall.search.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

public class GulimallSessionConfig {

    @Bean
    public CookieSerializer cookieSerializer(){
        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();

        cookieSerializer.setDomainName("gulimall.com");
        cookieSerializer.setCookieName("GULISESSION");

        return cookieSerializer;
    }

    @Bean
    public RedisSerializer<Object> springSessionDefaulRedisSerializer(){
        return new GenericJackson2JsonRedisSerializer();
    }
}
