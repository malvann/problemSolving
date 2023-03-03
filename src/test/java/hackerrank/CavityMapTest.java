package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CavityMapTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<String> grid, List<String> result) {
        assertEquals(result, new CavityMap().cavityMap(grid));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("179443854", "961621369", "164139922", "968633951", "812882578", "257829163", "812438597", "176656233", "485773814")), new ArrayList<>(List.of("179443854", "961X21369", "164139922", "96X633951", "812882578", "25782X163", "8124385X7", "176656233", "485773814"))),
                Arguments.of(new ArrayList<>(List.of("2476387", "1485738", "6591334", "9589583", "6827769", "2559498", "1822388")), new ArrayList<>(List.of("2476387", "1485X38", "65X1334", "958X5X3", "6X27769", "255X4X8", "1822388"))),
                Arguments.of(new ArrayList<>(List.of("17323", "83521", "68656", "44424", "98855")), new ArrayList<>(List.of("17323", "83521", "6X656", "44424", "98855"))),
                Arguments.of(new ArrayList<>(List.of("6254", "9979", "9153", "6678")), new ArrayList<>(List.of("6254", "9979", "9153", "6678"))),
                Arguments.of(new ArrayList<>(List.of("1112", "1912", "1892", "1234")), new ArrayList<>(List.of("1112", "1X12", "18X2", "1234"))),
                Arguments.of(new ArrayList<>(List.of("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999")), new ArrayList<>(List.of("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999")))
        );
    }
}