package me.zeph.spring.redis.json.springredisjson.repository;

import me.zeph.spring.redis.json.springredisjson.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository {

  @Autowired
  private RedisTemplate<String, Profile> profileRedisTemplate;

  public void save(Profile profile) {
    profileRedisTemplate.opsForValue().set(profile.getId(), profile);
  }

  public Profile get(String id) {
    return profileRedisTemplate.opsForValue().get(id);
  }
}
