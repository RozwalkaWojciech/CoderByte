package pl.rozwalka.coderbyte.palindrom.two;

/*Using the Java language, have the function PalindromeTwo(str)
take the str parameter being passed and return the string true if the parameter is a palindrome,
(the string is the same forward as it is backward) otherwise return the string false.
The parameter entered may have punctuation and symbols but they should not affect whether the string is in fact a palindrome.
For example: "Anne, I vote more cars race Rome-to-Vienna" should return true. */

class Main {

    public static String PalindromeTwo(String str) {

        str = str.replaceAll("[\\W 0-9 _]", "").trim().toLowerCase();
        var sb = new StringBuilder(str).reverse();

        return str.contains(sb) ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(PalindromeTwo("My name i's AN_NA, !!@#$ flj.89"));
        System.out.println(PalindromeTwo("Anne, I vote more cars race Rome-to-Vienna"));
    }
}
