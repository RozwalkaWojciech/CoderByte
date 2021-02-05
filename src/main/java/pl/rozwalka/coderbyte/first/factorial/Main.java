package pl.rozwalka.coderbyte.first.factorial;

/*
Problem Description: Using the Java language, have the function FirstFactorial(num) take the num parameter
being passed and return the factorial of it (ie. if num = 4, return (4 * 3 * 2 * 1)). For the test cases,
the range will be between 1 and 18.
*/

import java.util.Scanner;

class Main {

    public static int FirstFactorial(int num) {

        int counter = num;

        for (int i = 1; i < counter; i++) {
            num = num * i;
        }
        return num;
    }

    public static int FirstFactorialRecursion(int num) {
        if (num == 0) {
            return 1;
        }
        return num * (FirstFactorialRecursion(num - 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

}