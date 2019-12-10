package me.zeph.spring.redis.json.springredisjson.repository;

import me.zeph.spring.redis.json.springredisjson.model.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceRepository {

  @Autowired
  private RedisTemplate<String, Resource> resourceRedisTemplate;

  public void save(Resource resource) {
    resourceRedisTemplate.opsForValue().set(resource.getId(), resource);
  }

  public Resource get(String id) {
    return resourceRedisTemplate.opsForValue().get(id);
  }

}
