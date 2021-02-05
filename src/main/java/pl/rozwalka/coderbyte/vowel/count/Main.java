package pl.rozwalka.coderbyte.vowel.count;

/*
 * Description: Using the Java language, have the function  VowelCount(str)
 * take the str string parameter being passed and return the number of vowels
 * the string contains (ie. "All cows eat grass" would return 5). Do not count
 * y as a vowel for this challenge.
 */

class Main {

    public static String VowelCheck(String str) {

        str = str.toLowerCase().trim();
        char[] chars = str.toCharArray();
        int count = 0;

        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i') {
                count++;
            }
        }
        return Integer.toString(count);
    }

    public static void main(String[] args) {
        System.out.println(VowelCheck("All cows eat grass"));
    }
}
