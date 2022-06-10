/* Exercise by xDranik from Codewars
*
* A function that takes a string of parentheses and determines if the order of the parentheses is valid.
*
 * */

import java.util.ArrayList;

public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        String[] splitList = parens.split("");
        ArrayList<String> split = new ArrayList<>();

        int open = 0, close = 0;
        boolean bool = false, run = true;

        for (String value : splitList) {
            if (value.equals("(")) {
                split.add(value);
            }
            if (value.equals(")")) {
                split.add(value);
            }
        }
        for (String s : split) {
            if (run) {
                if (s.equals("(") && open >= close) {
                    open += 1;
                } else if (s.equals(")") && open >= close) {
                    close += 1;
                } else {
                    run = false;
                }
            }
        }
        if (open == close) {
            bool = true;
        }
        return bool;
    }
}
