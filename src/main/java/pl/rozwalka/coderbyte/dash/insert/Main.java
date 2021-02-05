package pl.rozwalka.coderbyte.dash.insert;

/*
Using the Java language, have the function DashInsert(str) insert dashes ('-') between each two odd numbers in str.
For example: if str is 454793 the output should be 4547-9-3. Don't count zero as an odd number.
*/

class Main {

    public static String DashInsert(String str) {

        var sb = new StringBuilder().append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) % 2 != 0 && str.charAt(i - 1) % 2 != 0) {
                sb.append("-").append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(DashInsert("454793"));
    }
}
