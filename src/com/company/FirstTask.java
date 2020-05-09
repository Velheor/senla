package com.company;

public class FirstTask {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isSimple(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String isEvenAndIsSimple(int number) {
        String result;
        if (isEven(number)) {
            result = "even ";
        } else {
            result = "odd ";
        }
        if (isSimple(number)) {
            result += "simple";
        } else {
            result += "difficult";
        }
        return result;
    }
}
