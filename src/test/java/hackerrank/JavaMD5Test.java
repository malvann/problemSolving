package hackerrank;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaMD5Test {
    @Test
    void test(){
        assertEquals(
                "68e109f0f40ca72a15e05cc22786f8e6",
                new JavaMD5().code("HelloWorld"));
    }
}