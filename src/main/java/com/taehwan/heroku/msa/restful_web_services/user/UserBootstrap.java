package com.taehwan.heroku.msa.restful_web_services.user;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UserBootstrap implements CommandLineRunner {
  private final UserService userService;

  @Override
  public void run(String... args) throws Exception {
    System.out.println("✅ UserBootstrap Started with hash code : "+this.hashCode());

    userService.addUser(User.builder()
        .id(UUID.randomUUID())
        .name("Taehwan")
        .birthDate(LocalDate.of(1990, 1, 1))
        .address("Seoul")
        .build());

    userService.addUser(User.builder()
        .id(UUID.randomUUID())
        .name("Maria")
        .birthDate(LocalDate.of(1995, 5, 15))
        .address("Torreón")
        .build());

    userService.addUser(User.builder()
        .id(UUID.randomUUID())
        .name("John")
        .birthDate(LocalDate.of(1988, 7, 7))
        .address("New York")
        .build());

    userService.addUser(User.builder()
        .id(UUID.randomUUID())
        .name("Soojin")
        .birthDate(LocalDate.of(1992, 10, 5))
        .address("Busan")
        .build());

    userService.addUser(User.builder()
        .id(UUID.randomUUID())
        .name("Carlos")
        .birthDate(LocalDate.of(1993, 3, 20))
        .address("Monterrey")
        .build());

    System.out.println("✅ 5 users initialized in memory.");
  }
}
