package pl.rozwalka.coderbyte.longest.word;

/*
Description: Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and
return the largest word in the string. If there are two or more words that are the same length, return
the first word from the string with that length. Ignore punctuation and assume sen will not be empty.
*/

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
