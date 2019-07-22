package com.stackroute.pe4;

import java.util.Arrays;

public class StringAlphabetical {
    public String[] sortWords(String paragraph) {
        if (paragraph == null) {
            return null;
        }//splitting the given string and sorting that array
        String[] required = paragraph.split("[\\s,]+");
        Arrays.sort(required);
        return required;
    }
}

