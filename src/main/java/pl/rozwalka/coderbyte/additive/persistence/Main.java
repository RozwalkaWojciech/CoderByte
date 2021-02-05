package pl.rozwalka.coderbyte.additive.persistence;

/*Using the Java language, have the function AdditivePersistence(num)
take the num parameter being passed which will always be a positive integer and return
its additive persistence which is the number of times you must add the digits in num until
you reach a single digit. For example: if num is 2718 then your program should return 2
because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9. */

import java.util.Scanner;

class Main {

    public static int AdditivePersistence(int num) {

        String[] arr = String.valueOf(num).split("");
        int count = 0;
        int sum = 0;

        if (arr.length == 1) {
            return count;
        }
        while (arr.length != 1) {
            for (String n : arr) {
                sum += Integer.parseInt(n);
            }
            count++;
            arr = String.valueOf(sum).split("");
            sum = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(AdditivePersistence(sc.nextInt()));
    }
}
