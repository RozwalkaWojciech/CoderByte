package pl.rozwalka.coderbyte.time.convert;

/*
 Using the Java language, have the function TimeConvert(num) take the num
 parameter being passed and return the number of hours and minutes the parameter
 converts to (ie. if num = 63 then the output should be 1:3). Separate the
 number of hours and minutes with a colon.
 Sample test cases:
 Input:  126
 Output: "2:6"
 Input:  45
 Output: "0:45"
 */

class Main {

    public static String TimeConvert(int num) {
        if (num < 60) {
            return "0:" + num;
        }
        return (num / 60) + ":" + (num % 60);
    }

    public static void main(String[] args) {
        System.out.println(TimeConvert(126));
        System.out.println(TimeConvert(45));
        System.out.println(TimeConvert(63));
    }
}
