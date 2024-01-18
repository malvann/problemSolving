package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int ch : s.chars().toArray()) {
            if (ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else {
                if (st.isEmpty()) return false;
                if ((st.peek() == '(' && ch == ')')
                        || (st.peek() == '{' && ch == '}')
                        || (st.peek() == '[' && ch == ']')) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
