package pl.rozwalka.coderbyte.anagram;

import java.util.Arrays;

class Main {

    public static boolean Anagram(String str1, String str2) {

        char[] chars1 = str1.replace(" ", "").toLowerCase().toCharArray();
        char[] chars2 = str2.replace(" ", "").toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String str1 = "krasa raska Arska keb ab";
        String str2 ="Ara ks KarSa r kaas baKEB";
        System.out.println(Anagram(str1,str2));
    }
}
