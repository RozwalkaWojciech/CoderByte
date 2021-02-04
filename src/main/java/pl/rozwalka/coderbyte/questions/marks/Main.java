package pl.rozwalka.coderbyte.questions.marks;

import java.util.Scanner;

class Main {

    public static String QuestionsMarks(String str) {

        int quantityOfQuestionMarks = 0;
        int sumOfNumbers = 0;
        boolean foundFirstNumber = false;
        boolean foundSecondNumber = false;
        boolean valid = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 49 && str.charAt(i) <= 57) {
                sumOfNumbers += Integer.valueOf(String.valueOf(str.charAt(i)));

                if (!foundFirstNumber) {
                    foundFirstNumber = true;
                } else foundSecondNumber = true;
            }

            if (str.charAt(i) == 63 && (foundFirstNumber || foundSecondNumber)) {
                quantityOfQuestionMarks++;
            }

            if (foundFirstNumber && foundSecondNumber) {
                if (sumOfNumbers == 10 && quantityOfQuestionMarks == 3) {
                    valid = true;
                } else {
                    valid = false;
                }
                foundFirstNumber = false;
                foundSecondNumber = false;
                quantityOfQuestionMarks = 0;
                sumOfNumbers = 0;
            }
        }
        if (valid) {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}