package pl.rozwalka.coderbyte.palindrome;

import java.util.Scanner;

class Main {

    public static boolean Palindrome(String str) {

        String s = str.trim().toLowerCase();
        StringBuilder sb = new StringBuilder(s).reverse();

        return s.contains(sb);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(Palindrome(s.nextLine()));
    }
}
