package me.zeph.spring.redis.json.springredisjson.model;

import java.io.Serializable;
import java.util.List;

public class Resource<T> implements Identifiable, Serializable {

  private List<String> connections;
  private T data;
  private String id;

  public List<String> getConnections() {
    return connections;
  }

  public void setConnections(List<String> connections) {
    this.connections = connections;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getId() {
    return this.id;
  }
}
