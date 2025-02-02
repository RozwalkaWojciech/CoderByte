package pl.rozwalka.coderbyte.array.additional.i;

/*
 * Using the Java language, have the function ArrayAdditionI(arr) take the array
 * of numbers stored in arr and return the string true if any combination of numbers in the
 * array can be added up to equal the largest number in the array, otherwise return the string
 * false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because
 * 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, and
 * may contain negative numbers.
 */

import java.util.Arrays;

class Main {

    public static String ArrayAdditionalI(int[] arr) {

        Arrays.sort(arr);
        int largestNum = arr[arr.length - 1];
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sum - arr[i] == largestNum) {
                return "true";
            }
            if (largestNum - sum == 0) {
                return "true";
            }
        }
        return "false";
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 23, 10, 1, 3};
        System.out.println(ArrayAdditionalI(arr));
    }
}
