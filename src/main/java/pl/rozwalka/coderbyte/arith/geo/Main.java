package pl.rozwalka.coderbyte.arith.geo;

/*Using the Java language, have the function ArithGeo(arr) take the array of numbers
 * stored in arr and return the string "Arithmetic" if the sequence follows an arithmetic pattern
 * or return "Geometric" if it follows a geometric pattern. If the sequence doesn't follow either
 * pattern return -1. An arithmetic sequence is one where the difference between each of the
 * numbers is consistent, where as in a geometric sequence, each term after the first is multiplied
 * by some constant or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example:
 * [2, 6, 18, 54]. Negative numbers may be entered as parameters, 0 will not be entered, and
 * no array will contain all the same elements. */

class Main {

    public static String ArithGeo(int[] arr) {

        if ((arr[1] - arr[0]) == (arr[arr.length - 1] - arr[arr.length - 2])) {
            return "Arithmetic";
        } else if ((arr[1] % arr[0]) == (arr[arr.length - 1] % arr[arr.length - 2])) {
            return "Geometric";
        }
        return "-1";
    }

    public static void main(String[] args) {
        int[] test1 = {2, 4, 6, 8};
        int[] test2 = {2, 6, 18, 54};
        int[] test3 = {2, 7, 9, 23};
        System.out.println(ArithGeo(test1));
        System.out.println(ArithGeo(test2));
        System.out.println(ArithGeo(test3));
    }
}
