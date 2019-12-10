package me.zeph.spring.redis.json.springredisjson.controller;

import me.zeph.spring.redis.json.springredisjson.model.Profile;
import me.zeph.spring.redis.json.springredisjson.model.ResumeProfile;
import me.zeph.spring.redis.json.springredisjson.repository.ProfileRepository;
import me.zeph.spring.redis.json.springredisjson.repository.ResumeProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

  @Autowired
  private ProfileRepository profileRepository;

  @Autowired
  private ResumeProfileRepository resumeProfileRepository;

  @PostMapping(value = "/profiles")
  public ResponseEntity<Profile> saveProfile(@RequestBody Profile profile) {
    profileRepository.save(profile);
    return new ResponseEntity<>(profile, HttpStatus.CREATED);
  }

  @GetMapping(value = "/profiles/{id}")
  public ResponseEntity<Profile> getProfile(@PathVariable String id) {
    Profile profile = profileRepository.get(id);
    return new ResponseEntity<>(profile, HttpStatus.OK);
  }

  @GetMapping(value = "/resume-profiles/{id}")
  public ResponseEntity<ResumeProfile> getResumeProfile(@PathVariable String id) {
    ResumeProfile profile = resumeProfileRepository.get(id);
    return new ResponseEntity<>(profile, HttpStatus.OK);
  }
}
