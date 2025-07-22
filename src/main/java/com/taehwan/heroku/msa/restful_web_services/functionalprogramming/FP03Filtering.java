package com.taehwan.heroku.msa.restful_web_services.functionalprogramming;

import java.util.List;

public class FP03Filtering {
  public static void main(String[] args){
//    printAllNumbersInListStructured(List.of(12,9,13,4,6,4,3,212,630));
    printEvenNumbersInListStructured(List.of(12,9,13,4,6,4,3,212,630));
  }
  
  private static boolean isEven(int n){
    return n%2 == 0 ;
  }
  
  private static void printEvenNumbersInListStructured(List<Integer> integers) {
    integers.stream()
//        .filter(n -> FP03Filtering.isEven(n))
//        .filter(n -> n%2 == 0) // lambda expression
        .filter(FP03Filtering::isEven) // method reference
        .forEach(System.out::println);
  }
  
  private static void printAllNumbersInListStructured(List<Integer> integers) {
    integers.stream()
        .forEach(System.out::println);
  }
}
