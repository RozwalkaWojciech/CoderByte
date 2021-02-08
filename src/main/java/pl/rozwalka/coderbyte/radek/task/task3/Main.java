package pl.rozwalka.coderbyte.radek.task.task3;

/*ArrayChallenge*/

import java.util.Arrays;
import java.util.Objects;

class Main {

    public static int task3(int[] arr) {
        int count = 0;

        if (arr.length - 1 == arr[0]) {
            return count;
        }
        if (arr.length == 1) {
            return 1 + ((arr[0] / 2) - 1) * 3;
        }

        int[] arrCopy = new int[arr.length - 1];
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = arr[i + 1];
        }

        for (int i = 1; i <= arr[0]; i++) {
            if (Objects.equals(arrCopy, i)) {
                continue;
            } else {
                if (i % 2 != 0 && !Objects.equals(arrCopy, i + 1)) {
                    count++;
                }
                if (i > 2 && !Objects.equals(arrCopy, i - 2)) {
                    count++;
                }
                if (i < arr[0] - 2 && !Arrays.asList(arrCopy).contains(i + 2)) {
                    count++;
                }
            }
        }
        return count - 2;
    }

    public static void main(String[] args) {
        System.out.println(task3(new int[]{10, 2, 4, 7, 8}));
    }
}
