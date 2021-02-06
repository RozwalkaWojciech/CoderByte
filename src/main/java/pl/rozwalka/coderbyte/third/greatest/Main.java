package pl.rozwalka.coderbyte.third.greatest;

/*
 * Have the function ThirdGreatest(strArr) take the array of strings stored in strArr and return the third largest word
 * within in. So for example: if strArr is ["hello", "world", "before", "all"] your output should be world
 * because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because
 * it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output
 * should be after because the first three words are all 5 letters long, so return the last one.
 * The array will have at least three strings and each string will only contain letters.
 */

import java.util.Arrays;

class Main {

    public static String ThirdGreatest(String[] arr) {

        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() == s2.length()) {
                return 0;
            }
            return -1;
        });
    /*    Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                ......
            }
        });*/
        return arr[2];
    }

    public static void main(String[] args) {
        System.out.println(ThirdGreatest(new String[]{"hello", "world", "before", "all"}));
        System.out.println(ThirdGreatest(new String[]{"my", "name", "is", "Rafi"}));
        System.out.println(ThirdGreatest(new String[]{"hea", "heb", "hec", "hed"}));
    }
}
