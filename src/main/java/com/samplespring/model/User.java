package com.samplespring.model;

/**
 * Created by alexandre on 10/6/14.
 */
/* Mon model, basique, attention aux normes pour la création d'objets avec un ORM */
public class User {
  private String firstname;
  private String lastname;
  private String password;

  public User() {
  }

  public User(String firstname, String lastname, String password) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.password = password;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
