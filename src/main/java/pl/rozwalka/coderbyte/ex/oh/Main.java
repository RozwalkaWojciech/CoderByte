package pl.rozwalka.coderbyte.ex.oh;

import java.util.Scanner;

class Main {

    public static boolean ExOh(String str) {

        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                xCount++;
            } else {
                oCount++;
            }
        }
        return xCount == oCount;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(ExOh(s.nextLine()));
    }
}
