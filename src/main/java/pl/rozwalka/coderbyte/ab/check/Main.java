package pl.rozwalka.coderbyte.ab.check;

/*Using the Java language, have the function ABCheck(str)
take the str parameter being passed and return the string true if the characters
a and b are separated by exactly 3 places anywhere in the string at least once (ie. "lane borrowed"
would result in true because there is exactly three characters between a and b).
Otherwise return the string false. */

import java.util.Scanner;
import java.util.regex.Pattern;

class Main {

    public static boolean ABCheck(String str) {

        String s = str.toLowerCase();

        Pattern compile1 = Pattern.compile("a...b");
        Pattern compile2 = Pattern.compile("b...a");

        boolean matcher1 = compile1.matcher(str).find();
        boolean matcher2 = compile2.matcher(str).find();

        if (matcher1 || matcher2) {
            return true;
        }

//      *****************  another way  ********************
        for (int i = 0; i < s.length(); i++) {
            if (i + 4 < s.length() && s.charAt(i) == 'a' && s.charAt(i + 4) == 'b'
                    || i + 4 < s.length() && s.charAt(i) == 'b' && s.charAt(i + 4) == 'a'
            ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(ABCheck(s.nextLine()));
    }
}
