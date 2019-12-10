package me.zeph.spring.redis.json.springredisjson.controller;

import me.zeph.spring.redis.json.springredisjson.model.Profile;
import me.zeph.spring.redis.json.springredisjson.model.Resource;
import me.zeph.spring.redis.json.springredisjson.model.ResumeProfile;
import me.zeph.spring.redis.json.springredisjson.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResourceController {

  @Autowired
  private ResourceRepository resourceRepository;

  @PostMapping(value = "/resources")
  public ResponseEntity<Resource<Profile>> saveResource(@RequestBody Resource<Profile> resource) {
    resourceRepository.save(resource);
    return new ResponseEntity<>(resource, HttpStatus.CREATED);
  }

  @GetMapping(value = "/resources/{id}")
  public ResponseEntity<Resource<ResumeProfile>> getResource(@PathVariable String id) {
    return new ResponseEntity<>(resourceRepository.get(id), HttpStatus.OK);
  }

}
