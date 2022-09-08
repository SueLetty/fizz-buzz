package com.tlglearning;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public enum FizzBuzz {
  FIZZ, BUZZ;

  public static Set<FizzBuzz> valueOf(int num){
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class); //empty Set
    if(num % 3 == 0){
      result.add(FIZZ);
    }
    if (num % 5 == 0){
      result.add(BUZZ);
    }
    return result;
  }

}
