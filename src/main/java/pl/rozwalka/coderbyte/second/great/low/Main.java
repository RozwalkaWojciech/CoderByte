package pl.rozwalka.coderbyte.second.great.low;

/*
 * Description: Using the Java language, have the function SecondGreatLow(arr) take the array
 * of numbers stored in arr and return the second lowest and second greatest numbers, respectively,
 * separated by a space. For example: if arr contains [7, 7, 12, 98, 106] the output should be 12
 * 98. The array will not be empty and will contain at least 2 numbers. It can get tricky if
 * there's just two numbers!
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public static String SecondGreatLow(int[] arr) {

        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();

        if (arr.length == 2) {
            return arr[1] + " " + arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 1) {
            return list.get(0) + " " + list.get(0);
        } else {
            return list.get(1) + " " + list.get(list.size() - 2);
        }
    }

    public static void main(String[] args) {
        int[] arr = {59, 7, 7, 12, 98, 106};
        System.out.println(SecondGreatLow(arr));
    }
}
