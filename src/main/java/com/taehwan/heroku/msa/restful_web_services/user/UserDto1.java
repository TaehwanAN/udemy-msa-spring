package com.taehwan.heroku.msa.restful_web_services.user;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
public class UserDto1 {
  private UUID id;
  private String name;
  private LocalDate birthDate;
}
