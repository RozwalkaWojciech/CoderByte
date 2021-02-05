package pl.rozwalka.coderbyte.letter.changes;

/*
 * Description: Using the Java language, have the function LetterChanges(str) take
 * the str parameter being passed and modify it using the following algorithm. Replace
 * every letter in the string with the letter following it in the alphabet
 * (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string
 * (a, e, i, o, u) and finally return this modified string.
 */

import java.util.Scanner;

class Main {

    public static String LetterChanges(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'z') {
                c = 'a';
            } else if (c >= 'a' && c <= 'z') {
                c++;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    c = Character.toUpperCase(c);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }
}
