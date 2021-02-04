package pl.rozwalka.coderbyte.ab.check;

import java.util.Scanner;

class Main {

    public static boolean ABCheck(String str) {

        String s = str.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (i + 4 < s.length() && s.charAt(i) == 'a' && s.charAt(i + 4) == 'b'
                    || i + 4 < s.length() && s.charAt(i) == 'b' && s.charAt(i + 4) == 'a'
            ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(ABCheck(s.nextLine()));
    }
}
