package hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatingCharacterTest {

    @Test
    void t(){
        char[] chars = new char[]{1,4,5,1,2,4,5,3,4};
        int result = new FirstNonRepeatingCharacter().find(chars);
        assertEquals(2, result);
    }
}
