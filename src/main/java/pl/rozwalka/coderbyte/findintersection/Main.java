package pl.rozwalka.coderbyte.findintersection;

import java.util.Scanner;

class Main {

    public static String FindIntersection(String[] strArr) {
        String str1 = strArr[0];
        String str2 = strArr[1];
        String result = "";
        for (String check : str1.split(", ")) {
            for (String check2 : str2.split(", ")) {
                if (check.equals(check2)) {
                    if (result.length() == 0) {
                        result += check;
                    } else {
                        result += "," + check;
                    }
                }
            }
        }
        if (result.isEmpty())
            return "false";
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        String[] strArr = {s1, s2};
        System.out.print(FindIntersection(strArr));
    }
}