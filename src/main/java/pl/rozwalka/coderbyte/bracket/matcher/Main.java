package pl.rozwalka.coderbyte.bracket.matcher;

import java.util.ArrayDeque;

class Main {

    public static String BracketMatcher(String str) {

        var stack = new ArrayDeque<Character>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return "0";
                }
                stack.pop();
            }
        }
        return stack.isEmpty() ? "1" : "0";
    }

    public static void main(String[] args) {
        System.out.println(BracketMatcher("(sd(0)d)sd()()"));
    }
}
