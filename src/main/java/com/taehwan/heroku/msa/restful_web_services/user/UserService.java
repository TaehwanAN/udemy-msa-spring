package com.taehwan.heroku.msa.restful_web_services.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
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

  public User readUser(UUID userId){
    User resUser = null;
//    for(User user: userList){
//      if (user.getId().equals(userId)){
//        resUser = user;
//        break;
//      }
//    }
    Predicate<? super User> predicate = user -> user.getId().equals(userId);
    return userList.stream().filter(predicate).findFirst().get();
  }


}
