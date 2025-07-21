package com.taehwan.heroku.msa.restful_web_services.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  private final String pathReadAllUser = "/all";
  private final String pathReadUser = "/{userId}";


  @GetMapping(pathReadAllUser)
  public List<User> readUserAll(){
    return userService.readUserAll();
  }

  @GetMapping(pathReadUser)
  public User readUser(
      @PathVariable UUID userId
      ){
    return userService.readUser(userId);
  }
}
