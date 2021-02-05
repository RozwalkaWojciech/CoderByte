package pl.rozwalka.coderbyte.simplesymbols;

/*
Using the Java language, have the function SimpleSymbols(str) take the str
parameter being passed and determine if it is an acceptable sequence by either
returning the string true or false. The str parameter will be composed of + and
= symbols with several letters between them (ie. ++d+===+c++==a) and for the
string to be true each letter must be surrounded by a + symbol. So the string to
the left would be false. The string will not be empty and will have at least one
letter.
Sample test cases:
Input:  "+d+=3=+s+"
Output: "true"
Input:  "f++d+"
Output: "false"
*/

class Main {

    public static String SimpleSymbols(String str) {

        char[] arr = str.toCharArray();
        int letterCount = 0;
        int schema = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                letterCount++;
            }
            if (arr[i] == '+') {
                if (i + 2 < arr.length) {
                    if (Character.isLetter(arr[i + 1]) && arr[i + 2] == '+') {
                        schema++;
                    }
                }
            }
        }
        return letterCount == schema ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(SimpleSymbols("+d+=3=+s+"));
        System.out.println(SimpleSymbols("f++d+"));
    }
}
