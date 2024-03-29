package hackerrank.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class SourceReader {
    public static List<String> readAllFileByUrl(String url, int skipLinesNum) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            return reader.lines().skip(skipLinesNum).toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
