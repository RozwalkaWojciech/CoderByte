package pl.rozwalka.coderbyte.multiplicative.persistence;

/*
 * Have the function MultiplicativePersistence(num) take the num parameter being passed which will always be a
 * positive integer and return its multiplicative persistence which is the number of times you must multiply the digits
 * in num until you reach a single digit. For example: if num is 39 then your program should
 * return 3 because 3 * 9 = 27 then 2 * 7 = 14 and finally 1 * 4 = 4 and you stop at 4.
 */

class Main {

    public static int MultiplicativePersistence(int num) {

        String[] arr = String.valueOf(num).split("");
        int count = 0;
        int sum = 1;

        if (num < 9) {
            return count;
        }
        while (arr.length != 1) {
            for (String s : arr) {
                sum *= Integer.parseInt(s);
            }
            count++;
            arr = String.valueOf(sum).split("");
            sum = 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(MultiplicativePersistence(39));
    }
}
