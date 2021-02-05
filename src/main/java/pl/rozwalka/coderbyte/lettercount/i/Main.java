package pl.rozwalka.coderbyte.lettercount.i;

/*
 * Description: Using the Java language, have the function LetterCountI(str) take the
 * str parameter being passed and return the first word with the greatest number of
 * repeated letters. For example: "Today, is the greatest day ever!" should return
 * greatest because it has 2 e's (and 2 t's) and it comes before ever which also
 * has 2 e's. If there are no words with repeating letters return -1. Words will
 * be separated by spaces.
 */

class Main {

    public static String LetterCountI(String str) {

        String[] arr = str.split(" ");
        int count = 0;
        String letter = "";
        int great = 0;

        for (String word : arr) {
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                if (count > great) {
                    great = count;
                    letter = String.valueOf(word.charAt(i));
                }
                count = 0;
            }
        }
        if (great == 1) {
            return "-1";
        }
        return letter;
    }

    public static void main(String[] args) {
        System.out.println(LetterCountI("Today, is the greatest day ever!"));
    }
}
