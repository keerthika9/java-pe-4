package com.stackroute.pe4;

public class ReplaceCharacters {
  public String replace(String input){
    if(input==null){
      return null;
    }
    String result=input.replaceAll("d","f");
    return result.replaceAll("l","t");
  }
}
