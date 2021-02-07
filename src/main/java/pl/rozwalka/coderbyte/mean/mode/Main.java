package pl.rozwalka.coderbyte.mean.mode;

/* Using the Java language, have the function MeanMode(arr)
take the array of numbers stored in arr and return 1 if the mode equals the mean,
0 if they don't equal each other (ie. [5, 3, 3, 3, 1] should return 1 because the mode (3) equals the mean (3)).
The array will not be empty, will only contain positive integers, and will not contain more than one mode. */

class Main {

    public static int MeanMode(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (avg == arr[i]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 3, 3, 1};

        System.out.println(MeanMode(arr));
    }
}
