package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FraudulentActivityNotificationsTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> expenditure, int trainingDays, int result) {
        assertEquals(result, new FraudulentActivityNotifications().activityNotifications(expenditure, trainingDays));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(List.of(2, 3, 4, 2, 3, 6, 8, 4, 5), 5, 2),
                Arguments.of(List.of(1, 2, 3, 4, 4), 4, 0),
                Arguments.of(List.of(10, 20, 30, 40, 50), 3, 1)
        );
    }
}
