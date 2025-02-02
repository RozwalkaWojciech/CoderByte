package pl.rozwalka.coderbyte.number.addition;

/*
 * Have the function NumberSearch(str) take the str parameter, search for all the numbers in the string,
 * add them together, then return that final number. For example: if str is "88Hello 3World!" the output should be 91.
 * You will have to differentiate between single digit numbers and multiple digit numbers like in the example above.
 * So "55Hello" and "5Hello 5" should return two different answers.
 * Each string will contain at least one letter or symbol.
 */

class Main {

    public static int NumberSearch(String str) {

        char[] arr = str.toLowerCase().replaceAll("[\\W a-z]", " ").toCharArray();
        var sb = new StringBuilder();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                sb.append(arr[i]);
            } else if (!sb.isEmpty()) {
                result += Integer.parseInt(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(NumberSearch("88Hello 3World!"));
    }
}
