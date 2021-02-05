package pl.rozwalka.coderbyte.ex.oh;

import java.util.Scanner;

/*
 * Description: Using the Java language, have the function  ExOh(str) take
 * the str parameter being passed and return the string true if there is
 * an equal number of x's and o's, otherwise return the string false. Only
 * these two letters will be entered in the string, no punctuation or numbers.
 * For example: if str is "xooxxxxooxo" then the output should return false
 * because there are 6 x's and 5 o's.
 */

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
