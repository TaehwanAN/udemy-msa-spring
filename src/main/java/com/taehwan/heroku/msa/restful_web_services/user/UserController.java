package com.taehwan.heroku.msa.restful_web_services.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  private final String pathReadAllUser = "/all";
  private final String pathReadUser = "/{userId}";
  private final String pathCreateUser = "";
  private final String pathDeleteUser = "/{userId}";


  @GetMapping(pathReadAllUser)
  public List<User> readUserAll(){
    return userService.readUserAll();
  }
  
  @GetMapping(pathReadUser)
  public ResponseEntity<User> readUser(
      @PathVariable UUID userId
  ){
    return userService.readUser(userId).map(ResponseEntity::ok).orElseThrow(() -> new UserNotFoundException("ID: " + userId));
  }
  
  @PostMapping(pathCreateUser)
  public ResponseEntity<User> createUser(
    @RequestBody User user
  ){
    // Header: location --> 이 자원의 uri 제공
    User createdUser = userService.createUser(user);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}").buildAndExpand(createdUser.getId()).toUri();
    return ResponseEntity.created(location).build();
  }
  
  @DeleteMapping(pathDeleteUser)
  public ResponseEntity<User> deleteUser(
      @PathVariable UUID userId
  ){
    return userService.deleteUser(userId).map(ResponseEntity::ok).orElseThrow(() -> new UserNotFoundException("ID: " + userId));
  }
  
}
