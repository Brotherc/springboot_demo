package com.brotherc.springbootehcache.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * @author: Brotherc
 * @date: 2019/7/20 9:30
 */
@Configuration
public class RedisCacheConfig extends CachingConfigurerSupport {
    /**
     * 自定义缓存管理器.
     *
     * @param redisTemplate
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate) {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
// 设置默认的过期时间
        cacheManager.setDefaultExpiration(20);
        Map<String, Long> expires = new HashMap<String, Long>();
// 单独设置
        expires.put("roncooCache", 200L);
        cacheManager.setExpires(expires);
        return cacheManager;
    }