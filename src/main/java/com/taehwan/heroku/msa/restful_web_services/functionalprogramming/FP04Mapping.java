package com.taehwan.heroku.msa.restful_web_services.functionalprogramming;

import java.util.List;

public class FP04Mapping {
  public static void main(String[] args){
    multiplyAllNumbersInListStructured(List.of(12,9,13,4,6,4,3,212,630));
  }
  
  private static void multiplyAllNumbersInListStructured(List<Integer> integers) {
    integers.stream()
        .map(i -> i * i * i)
        .forEach(System.out::println);
  }
  
}
