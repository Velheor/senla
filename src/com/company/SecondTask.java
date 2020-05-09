package com.company;

public class SecondTask {
    public static String greatestCommonDivisorAndLeastCommonMultiple(int a, int b) {
        return "Greatest Common Divisor is " + greatestCommonDivisor(a, b) + ", Least Common Multiple is " + leastCommonMultiple(a, b);
    }

    public static int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }

    public static long leastCommonMultiple(int a, int b) {
        return a / greatestCommonDivisor(a, b) * b;
    }
}
