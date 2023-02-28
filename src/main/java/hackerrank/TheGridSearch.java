package hackerrank;

import java.util.List;

public class TheGridSearch {
    private static final String YES = "YES";
    private static final String NO = "NO";

    public String gridSearch(List<String> lines, List<String> patterns) {
        if (lines.size() < patterns.size()) return NO;
        return findPatterns(lines, patterns) ? YES : NO;
    }

    private boolean findPatterns(List<String> lines, List<String> patterns) {
        int i = 0;
        int j = 0;
        String line;
        int startInd = -1;
        int index;
        while (i < lines.size()) {
            if (j == patterns.size()) return true;

            line = lines.get(i);
            index = line.indexOf(patterns.get(j));
            if (startInd == -1) startInd = index;

            if (index != -1 && index == startInd) {
                lines.set(i, line.substring(0, index) + "X" + line.substring(index + 1));
                j++;
                i++;
            } else if (j != 0) {
                startInd = -1;
                i = 0;
                j = 0;
            } else i++;

        }
        return j == patterns.size();
    }
}
