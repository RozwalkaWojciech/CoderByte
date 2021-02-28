package pl.rozwalka.coderbyte.task.task1;

/*RADEK'S Task input = aabbbccddgghhhh  output = 2a3b2c2d2g4h*/

class Main {

    public static String task1(String str) {

        char[] chars = str.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                sb.append(count).append(chars[i - 1]);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(count).append(chars[chars.length - 1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(task1("aabbbccddgghhhh"));
    }
}
