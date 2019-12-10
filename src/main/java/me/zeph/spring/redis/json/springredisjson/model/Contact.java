package me.zeph.spring.redis.json.springredisjson.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

public class Contact implements Serializable {

  private String email;
  private String mobile;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}
