package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static hackerrank.util.SourceReader.readAllFileByUrl;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SherlockAndPairsTest {
    @ParameterizedTest
    @MethodSource(value = "downloadSource")
    void test(List<Integer> nums, long result) {
        assertEquals(result, SherlockAndPairs.solve(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2), 90),
                Arguments.of(List.of(671, 949, 460, 546, 634, 679, 496, 533, 825, 173), 0),
                Arguments.of(List.of(1, 2, 3), 0),
                Arguments.of(List.of(1, 1, 2), 2)
        );
    }

    private static Stream<Arguments> downloadSource() {
        List<Long> results = readAllFileByUrl("https://hr-testcases-us-east-1.s3.amazonaws.com/1932/output02.txt?AWSAccessKeyId=AKIAR6O7GJNX5DNFO3PV&Expires=1680510867&Signature=UFZyasvD9NZHUs0TMCfTfU2ueJo%3D&response-content-type=text%2Fplain", 0)
                .stream().map(s -> Long.valueOf(s.strip())).toList();
        List<List<Integer>> sources = readAllFileByUrl("https://hr-testcases-us-east-1.s3.amazonaws.com/1932/input02.txt?AWSAccessKeyId=AKIAR6O7GJNX5DNFO3PV&Expires=1680510724&Signature=QjyjwOQUq3u%2B7KO%2BalsUHug7ioA%3D&response-content-type=text%2Fplain", 1)
                .stream().map(line -> line.strip().split(" "))
                .filter(strings -> strings.length > 1)
                .map(strings -> Stream.of(strings).map(Integer::valueOf).toList())
                .toList();
        return IntStream.range(0, results.size())
                .mapToObj(index -> Arguments.of(sources.get(index), results.get(index)));
    }
}