package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static hackerrank.util.SourceReader.readAllFileByUrl;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TheBombermanGameTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int n, List<String> grid, List<String> result) {
        assertEquals(result, new TheBombermanGame().bomberMan(n, grid));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(199,
                        readAllFileByUrl("https://hr-testcases-us-east-1.s3.amazonaws.com/22193/input09.txt?AWSAccessKeyId=AKIAR6O7GJNX5DNFO3PV&Expires=1679260627&Signature=6kiA3y0IruLMgtWxv0Mb1KM7erk%3D&response-content-type=text%2Fplain"),
                        readAllFileByUrl("https://hr-testcases-us-east-1.s3.amazonaws.com/22193/output09.txt?AWSAccessKeyId=AKIAR6O7GJNX5DNFO3PV&Expires=1679260640&Signature=%2FXoynj61AOGhgLh81NRALfKbcz4%3D&response-content-type=text%2Fplain")),
                Arguments.of(3,
                        List.of(
                                ".......",
                                "...O...",
                                "....O..",
                                ".......",
                                "OO.....",
                                "OO....."
                        ),
                        List.of(
                                "OOO.OOO",
                                "OO...OO",
                                "OOO...O",
                                "..OO.OO",
                                "...OOOO",
                                "...OOOO"
                        )),
                Arguments.of(2,
                        List.of(".......O.OO..O...OO..........O.........OO..O..O.O..OOO.O.O..O...O..O..O...OOO.....OO........O.O..O..O..O.O.O..OO..O.......OO........O...OO.O....O...O.....OO....O..OO.O...OO.O.OO...OO......OOO.."),
                        List.of("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO")),
                Arguments.of(5,
                        List.of(".......",
                                "...O.O.",
                                "....O..",
                                "..O....",
                                "OO...OO",
                                "OO.O..."),
                        List.of(".......",
                                "...O.O.",
                                "...OO..",
                                "..OOOO.",
                                "OOOOOOO",
                                "OOOOOOO")),
                Arguments.of(253764589,
                        List.of("O...OO.OO...OOO.OO......OO.O..OO..O.O......O......OO....O...O.......O.OO..OO.OO.O...........O...OOOO.OO.OO.O.OO......O...O......O..O...O...O..OO........O.O.........O.....OOO......O..O.O...O.......",
                                "..OO.O......O..O.....O.O..O...O....OOO.O.OO.OO.........OO....O.OOO.OO.O..OO...O......O.O...O...OO.....O.............O...O..OO....OO.O.O...O..OO....O.OO.O.O.OO.OOO.......O..O.OO......O.....OO..O..."),
                        List.of("OOOOOOOOO...OOOOOO......OOOO.OOO..OOO.....OOO.....OO....O...O...O...OOOOOOOO.OOOO...........O...OOOO.OOOOO.O.OO......O...OOO....OOOO...O...OOOOO......OOOOOOO...O...O.....OOOOO....O.OOOO...O.......",
                                "OOOOOOOO....OOOOO....O.OOOO...O....OOO.O.OOOOO.........OO....O.OOO.OOOOOOOO...OO.....O.O...O...OOOO...OOO...........O...OOOOO....OOOO.O...OOOOO....O.OOOOOOOOO.OOO.......OOOOOOO......OO....OO..O..."))
        );
    }
}