package pl.rozwalka.coderbyte.palindrome;

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
