package pl.rozwalka.coderbyte.codeland.username.validation;

/* Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine
   if the string is a valid username according to the following rules:
        1. The username is between 4 and 25 characters.
        2. It must start with a letter.
        3. It can only contain letters, numbers, and the underscore character.
        4. It cannot end with an underscore character.
   If the username is valid then your program should return the string true, otherwise return the string false.
*/

import java.util.Scanner;

class Main {

    public static String CodelandUsernameValidation(String str) {

        if (str.length() < 4 || str.length() > 25) {
            return "false";
        }
        if (!Character.isLetter(str.charAt(0))) {
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