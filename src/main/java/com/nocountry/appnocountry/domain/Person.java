package com.nocountry.appnocountry.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {

  private Long id;
  private String name;
  private String lastName;
  private String dni;
  private String email;
  private String phoneNumber;
  private String dateBirth;

}
