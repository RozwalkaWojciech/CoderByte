package pl.rozwalka.coderbyte.firstreverse;

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
