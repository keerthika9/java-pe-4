package com.stackroute.pe4;

public class Transpose {
    String[] transposeString(String str) {
        String[] string = str.split("\\s");
        for (int i = 0; i < string.length; i++) {
            String reverse = "";
            //Reversing the given string using for loop
            for (int j = string[i].length() - 1; j >= 0; j--) {
                reverse = reverse + string[i].charAt(j);
            }

            string[i] = reverse;
        }
        return string;
    }

}
