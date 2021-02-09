package pl.rozwalka.coderbyte.radek.task.task2;

class Main {

    public static String task2(String str) {

        String result = "";
        StringBuilder sb;
        StringBuilder revSb;

        for (int i = 0; i < str.length(); i++) {
            sb = new StringBuilder(str);
            result = String.valueOf(str.charAt(i));
            sb.deleteCharAt(i);

            revSb = new StringBuilder(sb).reverse();

            if (revSb.toString().equals(sb.toString())) {
                return result;
            } else {
                if (i == str.length() - 1) {
                    return "not possible";
                }
                sb = new StringBuilder(str);
                result = str.charAt(i) + String.valueOf(str.charAt(i + 1));
                sb.delete(i, i + 2);

                revSb = new StringBuilder(sb).reverse();
                if (revSb.toString().equals(sb.toString())) {
                    return result;
                }
            }
        }
        return "not possible";
    }

    public static void main(String[] args) {
        System.out.println(task2("jkklkkj"));
        System.out.println(task2("aabbdfbbaa"));
        System.out.println(task2("qqwrssrhwqq"));
        System.out.println(task2("oppog"));
        System.out.println(task2("qwerty"));
        System.out.println(task2("qrstq"));
    }
}
