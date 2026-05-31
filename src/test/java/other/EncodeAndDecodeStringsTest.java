package other;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncodeAndDecodeStringsTest {
    @Test
    void test() {
        EncodeAndDecodeStrings target = new EncodeAndDecodeStrings();
        List<String> expected = List.of("Hello", "World", "");
        String encode = target.encode(expected);
        List<String> decode = target.decode(encode);
        assertEquals(expected, decode);

        encode = target.encode(List.of());
        decode = target.decode(encode);
        assertEquals(List.of(), decode);
    }
}