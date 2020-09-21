package com.example.netty4152bug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class Netty4152BugApplicationTests {

    @Autowired
    private StringRedisTemplate template;

    @Test
    void contextLoads() {
        template.opsForValue().set("hello", "world");
    }

}
