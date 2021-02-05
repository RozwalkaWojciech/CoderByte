package pl.rozwalka.coderbyte.alphabet.soup;

/*Using the Java language, have the function AlphabetSoup(str)
 take the str string parameter being passed and return the string with the letters
 in alphabetical order (ie. hello becomes ehllo).
 Assume numbers and punctuation symbols will not be included in the string. */

import java.util.Arrays;

class Main {

    public static String AlphabetSoup(String str) {

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        return String.copyValueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(AlphabetSoup("hello"));
    }
}
