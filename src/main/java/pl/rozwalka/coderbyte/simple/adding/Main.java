package pl.rozwalka.coderbyte.simple.adding;

/*
Simple Adding
Have the function SimpleAdding(num) add up all the numbers from 1 to num.
For example: if the input is 4 then your program should return 10
because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter
num will be any number from 1 to 1000.
Examples
Input: 12
Output: 78
Input: 140
Output: 9870
*/

class Main {

    public static int SimpleAdding(int num) {

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SimpleAdding(4));
        System.out.println(SimpleAdding(12));
        System.out.println(SimpleAdding(140));
    }
}
