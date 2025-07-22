package com.taehwan.heroku.msa.restful_web_services.functionalprogramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FP05Predicate {
  public static void main(String[] args){
    List<String> fruits = List.of("apple","banana","carrot");
    
    Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
    Optional<String> optional = fruits.stream().filter(predicate).findAny();
    System.out.println(optional);
    System.out.println(optional.isEmpty());
    System.out.println(optional.isPresent());
    System.out.println(optional.get());
    
    
    
    
    
  }
}
