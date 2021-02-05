package pl.rozwalka.coderbyte.word.count;

/*
 * Description: Using the Java language, have the function  WordCount(str)
 * take the str string parameter being passed and return the number of
 * words the string contains (ie. "Never eat shredded wheat" would return 4).
 * Words will be separated by single spaces.
 * Note: After completing this problem I checked another users solution and found a more optimal way of doing this:
	String[] myArray = str.split(" ");
	Integer count = myArray.length;
	str = count.toString();
	return str;
 */

class Main {

    public static String WordCount(String str) {
        return String.valueOf(str.split(" ").length);
    }

    public static void main(String[] args) {
        System.out.println(WordCount("This is my friends cat"));
    }
}
