package pl.rozwalka.coderbyte.codeland.username.validation;

import java.util.Scanner;
import java.util.regex.Pattern;

class Main {

    public static String CodelandUsernameValidation(String str) {

        if (str.length() < 4 || str.length() > 25) {
            return "false";
        }
        if (!Pattern.compile("^[A-z]").matcher(str).find()) {
            return "false";
        }
        if (str.endsWith("_")) {
            return "false";
        }
        if (!str.matches("^[a-zA-Z0-9_]+")) {
            return "false";
        }
        return "true";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}