package pl.rozwalka.coderbyte.swapcase;

/*
 * Have the function SwapCase(str) take the str parameter and swap the case of each character.
 * For example: if str is "Hello World" the output should be hELLO wORLD.
 * Let numbers and symbols stay the way they are.
 */

class Main {

    public static String SwapCase(String str) {

        var sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i))) {
                    sb.append(Character.toLowerCase(str.charAt(i)));
                } else {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(SwapCase("Hello World"));
        System.out.println(SwapCase("Hello 56*World"));
    }
}
