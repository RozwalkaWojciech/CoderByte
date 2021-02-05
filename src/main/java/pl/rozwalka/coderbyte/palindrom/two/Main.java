package pl.rozwalka.coderbyte.palindrom.two;

class Main {

    public static boolean PalindromeTwo(String str) {

        str = str.replaceAll("[\\W 0-9 _]", "").trim().toLowerCase();
        var sb = new StringBuilder(str).reverse();

        return str.contains(sb);
    }

    public static void main(String[] args) {
        System.out.println(PalindromeTwo("My name i's AN_NA, !!@#$ flj.89"));
        System.out.println(PalindromeTwo("Anne, I vote more cars race Rome-to-Vienna"));
    }
}
