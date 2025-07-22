package com.taehwan.heroku.msa.restful_web_services.functionalprogramming;

import java.util.List;

public class FP01Structured {
  public static void main(String[] args){
    printAllNumbersInListStructured(List.of(12,9,13,4,6,4,3,212,630));
  }
  
  private static void printAllNumbersInListStructured(List<Integer> integers) {
    // How to loop the numbers?
    for (int i : integers){
      System.out.println(i);
    }
  }
}
