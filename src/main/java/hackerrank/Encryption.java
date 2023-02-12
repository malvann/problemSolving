package hackerrank;

import java.util.stream.Stream;

public class Encryption {
    public static String encryption(String s) {
        int rowNum = (int) Math.floor(Math.sqrt(s.length()));
        int colNum = (int) Math.ceil(Math.sqrt(s.length()));
        if (rowNum * colNum < s.length()) rowNum = colNum;

        char[][] matrix = new char[colNum][rowNum];
        char[] chars = s.toCharArray();

        int colCounter = 0;
        int rowCounret = 0;
        int chIndex = 0;
        int counter = rowNum * colNum;
        while (counter != 0) {
            matrix[colCounter][rowCounret] = chIndex < chars.length
                    ?  chars[chIndex]
                    : '0';
            colCounter++;
            if (colCounter == colNum) {
                colCounter = 0;
                rowCounret++;
            }
            chIndex++;
            counter--;
        }
        StringBuilder buffer = new StringBuilder();
        Stream.of(matrix).forEach(chArr -> buffer.append(chArr).append(" "));
        return buffer.substring(0, buffer.length() - 1).replace("0", "");
    }
}
