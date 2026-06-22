package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    @Test
    void test() {
        ValidParentheses target = new ValidParentheses();
        assertFalse(target.isValid("(("));
        assertTrue(target.isValid("([{}])"));
        assertFalse(target.isValid("("));
    }

}