package pl.rozwalka.coderbyte.vowel.count;

class Main {

    public static String VowelCheck(String str) {

        str = str.toLowerCase().trim();
        char[] chars = str.toCharArray();
        int count = 0;

        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i') {
                count++;
            }
        }
        return Integer.toString(count);
    }

    public static void main(String[] args) {
        System.out.println(VowelCheck("All cows eat grass"));
    }
}
