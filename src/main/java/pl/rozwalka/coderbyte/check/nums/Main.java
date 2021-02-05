package pl.rozwalka.coderbyte.check.nums;

/*Using the Java language, have the function CheckNums(num1,num2) take both parameters
being passed and return the string true if num2 is greater than num1,
otherwise return the string false. If the parameter values are equal
to each other then return the string -1. */

class Main {

    public static String CheckNums(int num1, int num2) {
        if (num2 > num1) {
            return "true";
        } else if (num1 > num2) {
            return "false";
        }
        return "-1";
    }


    public static void main(String[] args) {
        System.out.println(CheckNums(2, 5));
        System.out.println(CheckNums(8, 5));
        System.out.println(CheckNums(2, 2));
    }
}
