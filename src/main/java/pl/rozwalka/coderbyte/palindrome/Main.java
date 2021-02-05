package pl.rozwalka.coderbyte.palindrome;

/*
 * Description: Using the Java language, have the function  Palindrome(str)
 * take the str parameter being passed and return the string true if the
 * parameter is a palindrome, (the string is the same forward as it is backward)
 * otherwise return the string false. For example: "racecar" is also "racecar"
 * backwards. Punctuation and numbers will not be part of the string.
 */

import java.util.Scanner;

class Main {

    public static boolean Palindrome(String str) {

        str = str.trim().toLowerCase();
        var sb = new StringBuilder(str).reverse();

        return str.contains(sb);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(Palindrome(s.nextLine()));
    }
}
