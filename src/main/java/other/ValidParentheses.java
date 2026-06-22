package other;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public boolean isValid(String s) {
        List<Character> opChars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                opChars.add(ch);
                continue;
            }
            if (opChars.isEmpty() || (ch == ')' && !opChars.get(opChars.size() - 1).equals('(')) || (ch == ']' && !opChars.get(opChars.size() - 1).equals('[')) || (ch == '}' && !opChars.get(opChars.size() - 1).equals('{')))
                return false;
            opChars.remove(opChars.size() - 1);
        }
        return opChars.isEmpty();
    }
}
