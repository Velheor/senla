package com.company;

public class FifthTask {
    public static boolean isPalindrome(int number) {
        if (number < 10) {
            return false;
        }
        return Integer.toString(number).equals(new StringBuilder().append(number).reverse().toString());
    }
}
