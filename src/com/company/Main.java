package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLast(253));
        System.out.println(sumFirstAndLast(0));
        System.out.println(sumFirstAndLast(5));
        System.out.println(sumFirstAndLast(-10));

    }

    public static int sumFirstAndLast(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;

        while (number > 9) {
            number /= 10;
        }
        return number + lastDigit;
    }
}
