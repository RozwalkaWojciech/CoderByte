package pl.rozwalka.coderbyte.longest.word;

import java.util.Scanner;

class Main {

    public static String LongestWord(String sen) {

        String[] s = sen.replaceAll("[\\W]", " ").split(" ");
        String result = "";

        for (String word : s) {
            if (word.length() > result.length()) {
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
