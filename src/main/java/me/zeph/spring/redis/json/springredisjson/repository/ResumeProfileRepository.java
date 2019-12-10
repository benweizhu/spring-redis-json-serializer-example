package me.zeph.spring.redis.json.springredisjson.repository;

import me.zeph.spring.redis.json.springredisjson.model.ResumeProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResumeProfileRepository {

  @Autowired
  private RedisTemplate<String, ResumeProfile> resumeProfileRedisTemplate;

  public ResumeProfile get(String id) {
    return resumeProfileRedisTemplate.opsForValue().get(id);
  }
}
