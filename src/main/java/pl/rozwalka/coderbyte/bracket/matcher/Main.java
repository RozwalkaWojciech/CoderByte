package pl.rozwalka.coderbyte.bracket.matcher;

/*Using the Java language, have the function BracketMatcher(str)
take the str parameter being passed and return 1 if the brackets are correctly
matched and each one is accounted for. Otherwise return 0. For example: if str is
"(hello (world))", then the output should be 1, but if str is "((hello (world))" the the output should be 0 because
the brackets do not correctly match up. Only "(" and ")" will be used as brackets. If str contains no brackets return 1. */

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
