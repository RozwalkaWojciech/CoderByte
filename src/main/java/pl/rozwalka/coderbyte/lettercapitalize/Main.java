package pl.rozwalka.coderbyte.lettercapitalize;

/*
Using the Java language, have the function LetterCapitalize(str) take the str
parameter being passed and capitalize the first letter of each word. Words will
be separated by only one space.
Sample test cases:
Input:  "hello world"
Output: "Hello World"
Input:  "i ran there"
Output: "I Ran There"
*/

class Main {

    public static String LetterCapitalize(String str) {

        String result = "";
        String[] arr = str.split(" ");

        for (String word : arr) {

            result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(LetterCapitalize("hello world"));
        System.out.println(LetterCapitalize("i ran there"));
    }
}
