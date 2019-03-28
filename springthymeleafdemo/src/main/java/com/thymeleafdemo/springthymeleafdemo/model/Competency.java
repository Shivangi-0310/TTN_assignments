package com.thymeleafdemo.springthymeleafdemo.model;

public enum Competency {

  USER("USER"),

  ADMIN("ADMIN"),

  SUPERADMIN("SUPER-ADMIN");

  private String value;

  Competency(String competency) {
    value = competency;
  }

  public String getValue() {
    return value;
  }
}
