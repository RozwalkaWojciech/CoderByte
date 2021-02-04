package pl.rozwalka.coderbyte.division.stringified;

import java.util.Scanner;

class Main {

    public static String DivisionStringified(int num1, int num2) {

        int result = (int) (Math.round(num1 / (double) num2));
        String[] str = Integer.toString(result).split("");
        int count = 0;

        for (int i = str.length-2; i >= 0; i--) {
            count++;
            if (count == 3) {
                str[i] = str[i]+",";
                count = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);

        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.print(DivisionStringified(num1, num2));
    }
}
