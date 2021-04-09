package com.example.atp.domain;

import io.micronaut.core.annotation.Creator;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity
public class Owner {

  // The ID of the class uses a generated sequence value
  @Id
  @GeneratedValue
  private Long id;

  private final String name;

  private int age;

  // the constructor reads column values by the name of each constructor argument
  @Creator
  public Owner(String name) {
      this.name = name;
  }

  // each property of the class maps to a database column
  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

  public String getName() {
      return name;
  }

  public Long getId() {
      return id;
  }

  public void setId(Long id) {
      this.id = id;
  }
}