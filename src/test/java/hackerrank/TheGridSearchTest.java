package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheGridSearchTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<String> lines, List<String> patterns, String result) {
        assertEquals(result, new TheGridSearch().gridSearch(lines, patterns));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of("999999", "121211")),
                        new ArrayList<>(List.of("99", "11")),
                        "YES"),
                Arguments.of(
                        new ArrayList<>(List.of("123412", "561212", "123634", "781288")),
                        new ArrayList<>(List.of("12", "34")),
                        "YES"),
                Arguments.of(
                        new ArrayList<>(List.of("400453592126560", "114213133098692", "474386082879648", "522356951189169", "887109450487496", "252802633388782", "502771484966748", "075975207693780", "511799789562806", "404007454272504", "549043809916080", "962410809534811", "445893523733475", "768705303214174", "650629270887160")),
                        new ArrayList<>(List.of("99", "99")),
                        "NO"),
                Arguments.of(
                        new ArrayList<>(List.of("34889246430321978567", "58957542800420926643", "35502505614464308821", "14858224623252492823", "72509980920257761017", "22842014894387119401", "01112950562348692493", "16417403478999610594", "79426411112116726706", "65175742483779283052", "89078730337964397201", "13765228547239925167", "26113704444636815161", "25993216162800952044", "88796416233981756034", "14416627212117283516", "15248825304941012863", "88460496662793369385", "59727291023618867708", "19755940017808628326")),
                        new ArrayList<>(List.of("1641", "7942", "6517", "8907", "1376", "2691", "2599")),
                        "NO"),
                Arguments.of(
                        new ArrayList<>(List.of("7283455864", "6731158619", "8988242643", "3830589324", "2229505813", "5633845374", "6473530293", "7053106601", "0834282956", "4607924137")),
                        new ArrayList<>(List.of("9505", "3845", "3530")),
                        "YES")
        );
    }
}
