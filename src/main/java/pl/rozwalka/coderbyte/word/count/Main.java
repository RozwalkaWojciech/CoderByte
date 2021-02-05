package pl.rozwalka.coderbyte.word.count;

class Main {

    public static String WordCount(String str) {
        return String.valueOf(str.split(" ").length);
    }

    public static void main(String[] args) {
        System.out.println(WordCount("This is my friends cat"));
    }
}
