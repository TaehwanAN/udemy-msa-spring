package com.taehwan.heroku.msa.restful_web_services.user;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class User {
  private UUID id;
  private String name;
  private LocalDate birthDate;
  private String address;
}
