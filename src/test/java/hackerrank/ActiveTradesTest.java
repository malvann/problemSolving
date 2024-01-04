package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActiveTradesTest {

    @ParameterizedTest
    @MethodSource
    void test(List<String> list, List<String> result) {
        assertEquals(result, ActiveTrades.mostActive(list));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of("Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Beta"),
                        List.of("Alpha", "Beta", "Omega")),
                Arguments.of(List.of("Alpha", "Beta", "Zeta", "Beta", "Zeta", "Zeta", "Epsilon", "Beta", "Zeta", "Beta", "Zeta", "Beta", "Delta", "Zeta", "Beta", "Zeta", "Beta", "Zeta", "Beta", "Zeta", "Beta"),
                        List.of("Beta", "Zeta"))
        );
    }
}