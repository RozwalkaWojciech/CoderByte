package pl.rozwalka.coderbyte.radek.task;

import java.util.Scanner;

class Main {

    public static String string(String str) {

        char[] chars = str.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                sb.append(count).append(chars[i - 1]);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(count).append(chars[chars.length - 1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(string(s.nextLine()));
    }
}
