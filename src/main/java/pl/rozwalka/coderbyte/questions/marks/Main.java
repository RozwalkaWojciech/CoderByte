package pl.rozwalka.coderbyte.questions.marks;

/*Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers,
 letters, and question marks, and check if there are exactly
 3 question marks between every pair of two numbers that add up to
 10. If so, then your program should return the string true, otherwise it should return the string false.
 If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
 For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because
 there are exactly 3 question marks between 6 and 4, and 3 question marks between
 5 and 5 at the end of the string.*/

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