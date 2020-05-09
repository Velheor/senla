package com.company;

public class FifthTask {
    public static boolean isPalindrome(int number) {
        if (number == 0) {
            return false;
        }
        return number % 11 == 0;
    }
}
