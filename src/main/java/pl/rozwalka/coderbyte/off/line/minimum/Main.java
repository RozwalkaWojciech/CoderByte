package pl.rozwalka.coderbyte.off.line.minimum;

/*
 * Have the function OffLineMinimum(strArr) take the strArr parameter being passed which will be an array of integers
 * ranging from 1...n and the letter "E" and return the correct subset based on the following rules.
 * The input will be in the following format: ["I","I","E","I",...,"E",...,"I"] where the I's stand for integers
 * and the E means take out the smallest integer currently in the whole set.
 * When finished, your program should return that new set with integers separated by commas.
 * For example: if strArr is ["5","4","6","E","1","7","E","E","3","2"] then your program should return 4,1,5.
 */

import java.util.ArrayList;
import java.util.Collections;

class Main {

    public static String OffLineMinimum(String[] str) {

        var allNum = new ArrayList<Integer>();
        var sb = new StringBuilder();

        for (String s : str) {
            if (s.equals("E")) {
                if (sb.isEmpty()) {
                    sb.append(allNum.get(0));
                } else {
                    sb.append(",").append(allNum.get(0));
                }
                allNum.remove(0);
            } else {
                allNum.add(Integer.parseInt(s));
                Collections.sort(allNum);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(OffLineMinimum(new String[]{"5", "4", "6", "E", "1", "7", "E", "E", "3", "2"}));
    }
}
