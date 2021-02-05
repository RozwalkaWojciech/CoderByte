package pl.rozwalka.coderbyte.ab.check;

import java.util.Scanner;
import java.util.regex.Pattern;

class Main {

    public static boolean ABCheck(String str) {

        String s = str.toLowerCase();

        Pattern compile1 = Pattern.compile("a...b");
        Pattern compile2 = Pattern.compile("b...a");

        boolean matcher1 = compile1.matcher(str).find();
        boolean matcher2 = compile2.matcher(str).find();

        if (matcher1 || matcher2){
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
