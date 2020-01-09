package com.larionov.epam.util.impl;

import com.larionov.epam.util.Utils;
import java.util.regex.Pattern;


public class UtilsImpl implements Utils {

    public String concatenateWords(String a, String b) {
        if (a == null || b == null){
            throw new NullPointerException();
        } else if (Pattern.matches("[a-zA-Z !]*", a) &&
                Pattern.matches("[a-zA-Z !]*", b)){
            return a + b;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int computeFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
