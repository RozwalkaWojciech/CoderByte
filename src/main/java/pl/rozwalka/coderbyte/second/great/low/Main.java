package pl.rozwalka.coderbyte.second.great.low;

/*
 * Description: Using the Java language, have the function SecondGreatLow(arr) take the array
 * of numbers stored in arr and return the second lowest and second greatest numbers, respectively,
 * separated by a space. For example: if arr contains [7, 7, 12, 98, 106] the output should be 12
 * 98. The array will not be empty and will contain at least 2 numbers. It can get tricky if
 * there's just two numbers!
 */

import java.util.TreeSet;

class Main {

    public static String SecondGreatLow(int[] arr) {

        var set = new TreeSet<Integer>();

        for (int num : arr) {
            set.add(num);
        }
        if (set.size() == 2) {
            return set.last() + " " + set.first();
        }
        if (set.size() == 1) {
            return set.first() + " " + set.first();
        }
        set.remove(set.first());
        set.remove(set.last());

        return set.first() + " " + set.last();
    }

    public static void main(String[] args) {
        int[] arr = {59, 7, 7, 12, 98, 106};
        System.out.println(SecondGreatLow(arr));
        System.out.println(SecondGreatLow(new int[]{5, 3}));
        System.out.println(SecondGreatLow(new int[]{5, 5, 5, 5, 5}));
        System.out.println(SecondGreatLow(new int[]{5, 8}));
        System.out.println(SecondGreatLow(new int[]{5, 8, 5}));
        System.out.println(SecondGreatLow(new int[]{5, 8, 9}));
    }
}
