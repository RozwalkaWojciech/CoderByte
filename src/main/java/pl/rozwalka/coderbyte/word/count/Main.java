package pl.rozwalka.coderbyte.word.count;

/*
 * Description: Using the Java language, have the function  WordCount(str)
 * take the str string parameter being passed and return the number of
 * words the string contains (ie. "Never eat shredded wheat" would return 4).
 * Words will be separated by single spaces.
 */

class Main {

    public static String WordCount(String str) {
        return String.valueOf(str.split(" ").length);
    }

    public static void main(String[] args) {
        System.out.println(WordCount("This is my friends cat"));
    }
}
