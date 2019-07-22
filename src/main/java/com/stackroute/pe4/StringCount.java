package com.stackroute.pe4;

public class StringCount {
    public int chardata(int count) {
        int result;
        String str = "String as a input";
        result = str.length();
        result = str.replace("a", "").length();
        int charcount = str.length() - str.replaceAll("a", "").length();
        result = charcount;
        return count;
    }

}
