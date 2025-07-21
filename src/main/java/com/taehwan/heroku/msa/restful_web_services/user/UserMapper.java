package com.taehwan.heroku.msa.restful_web_services.user;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
  UserDto1 toDto1(User user);
}
