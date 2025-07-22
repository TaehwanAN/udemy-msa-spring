package com.taehwan.heroku.msa.restful_web_services.functionalprogramming;

import java.util.List;

public class FP02Functional {
  public static void main(String[] args){
    printAllNumbersInListStructured(List.of(12,9,13,4,6,4,3,212,630));
  }
  
  private static void printNumber(int n){
    System.out.println(n);
  };
  
  private static void printAllNumbersInListStructured(List<Integer> integers) {
    // What to do? Not How to loop the numbers?
    
    integers.stream()
        .forEach(FP02Functional::printNumber);
  }
}