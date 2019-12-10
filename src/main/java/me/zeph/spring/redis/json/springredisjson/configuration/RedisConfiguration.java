package me.zeph.spring.redis.json.springredisjson.configuration;

import me.zeph.spring.redis.json.springredisjson.model.Profile;
import me.zeph.spring.redis.json.springredisjson.model.Resource;
import me.zeph.spring.redis.json.springredisjson.model.ResumeProfile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfiguration {
  @Bean
  public RedisTemplate<String, Profile> profileRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
    RedisTemplate<String, Profile> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(redisConnectionFactory);
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Profile.class));
    return redisTemplate;
  }

  @Bean
  public RedisTemplate<String, ResumeProfile> resumeProfileRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
    RedisTemplate<String, ResumeProfile> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(redisConnectionFactory);
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(ResumeProfile.class));
    return redisTemplate;
  }

  @Bean
  public RedisTemplate<String, Resource> resourceRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
    RedisTemplate<String, Resource> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(redisConnectionFactory);
    redisTemplate.setKeySerializer(new StringRedisSerializer());
    redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Resource.class));
    return redisTemplate;
  }
}
