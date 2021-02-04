package pl.rozwalka.coderbyte.letter.changes;

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
                if (c == 'a') c = 'A';
                if (c == 'e') c = 'E';
                if (c == 'i') c = 'I';
                if (c == 'o') c = 'O';
                if (c == 'u') c = 'U';
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
