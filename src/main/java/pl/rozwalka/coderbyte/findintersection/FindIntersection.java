package pl.rozwalka.coderbyte.findintersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {

    public static String FindIntersection(String[] strArr) {

        if (strArr.length < 2) {
            return "false";
        }
        if (strArr[0] == null || strArr[1] == null) {
            return "false";
        }
        if (strArr[0].isEmpty() || strArr[1].isEmpty()) {
            return "false";
        }
        if (strArr[0].trim().isBlank() || strArr[1].trim().isBlank()) {
            return "false";
        }

        String[] split1 = strArr[0].trim().split(",");
        String[] split2 = strArr[1].trim().split(",");
        String result = "";

        HashSet<String> set = new HashSet<>(Arrays.asList(split1));
        for (int i = 0; i < split2.length; i++) {
            if (!set.add(split2[i])) {
                if (result.isBlank()) {
                    result = split2[i];
                } else {
                    result += "," + split2[i].trim();
                }
            }
        }
        if (result.isBlank()) {
            return "false";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String[] strArr = {s1,s2};
        System.out.print(FindIntersection(strArr));
    }
}