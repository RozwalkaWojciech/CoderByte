package pl.rozwalka.coderbyte.radek.task.task3;

/*ArrayChallenge*/

import java.util.ArrayList;
import java.util.List;

class Main {

    public static int task3(int[] arr) {

        int count = 0;
        List<Integer> arrCopy = new ArrayList<>();

        if (arr.length - 1 == arr[0]) {
            return count;
        }
        if (arr.length == 1) {
            return 1 + ((arr[0] / 2) - 1) * 3;
        }

        for (int i = 1; i < arr.length; i++) {
            arrCopy.add(arr[i]);
        }

        for (int i = 1; i <= arr[0]; i++) {
            if (arrCopy.contains(i)) {
                continue;
            } else {
                if (i % 2 != 0 && !arrCopy.contains(i + 1)) {
                    count++;
                }
                if (i % 2 != 0 && !arrCopy.contains(i + 2) && i < arr[0] - 2) {
                    count++;
                }
                if (i % 2 == 0 && !arrCopy.contains(i + 2) && i != arr[0]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(task3(new int[]{10, 2, 4, 7, 8}));
    }
}
