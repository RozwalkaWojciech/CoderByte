package pl.rozwalka.coderbyte.first.factorial;

import java.util.Scanner;

class Main {

    public static int FirstFactorial(int num) {

        int counter = num;

        for (int i = 1; i < counter; i++) {
            num = num * i;
        }
        return num;
    }

    public static int FirstFactorialRecursion(int num) {
        if (num == 0) {
            return 1;
        }
        return num * (FirstFactorialRecursion(num - 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

}