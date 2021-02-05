package pl.rozwalka.coderbyte.firstreverse;

/*
Problem Description: Using the Java language, have the function FirstReverse(str) take the str parameter
being passed and return the string in reversed order.
*/

import java.util.Scanner;

class Main {

    public static String FirstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(FirstReverse(sc.nextLine()));
    }
}
