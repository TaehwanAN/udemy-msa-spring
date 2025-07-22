package com.taehwan.heroku.msa.restful_web_services.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

@Component
@RequiredArgsConstructor
public class UserService {
  /*
  *
  * */
  private final UserMapper userMapper;
  private final List<User> userList = new ArrayList<>();

  protected void addUser(User user) {
    userList.add(user);
  }

  public List<User> readUserAll(){
    return userList;
  }

  public Optional<User> readUser(UUID userId){
    User resUser = null;
    Predicate<? super User> predicate = user -> user.getId().equals(userId);
    return userList.stream().filter(predicate).findAny();
  }
  
  
  public User createUser(User user) {
    user.setId(UUID.randomUUID());
    userList.add(user);
    return user;
  }
  
  public Optional<User> deleteUser(UUID userId) {
    Predicate<? super User> predicate = user -> user.getId().equals(userId);
    Optional<User> deleteUser = userList.stream().filter(predicate).findAny();
    userList.removeIf(predicate);
    return deleteUser;
  }
}
