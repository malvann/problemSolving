package hackerrank;

import java.util.List;

public class CountLuck {
    private static final String PASS = "Impressed";
    private static final String FAIL = "Oops!";
    private static final char END = '*';
    private static final char START = 'M';
    private static final char ROAD = '.';
    private static final char TREE = 'X';

    private static List<String> m;
    private static int target;
    private static int counter;

    public static String countLuck(List<String> matrix, int k) {
        m = matrix;
        target = k;
        counter = 0;
        int x = 0;
        int y = 0;
        while (x < m.size()) {
            x = m.get(y).indexOf(START);
            if (x != -1) break;
            y++;
        }

        follow(x, y, -1, -1, m.get(y).charAt(x));
        return counter == k ? PASS : FAIL;
    }

    private static void follow(int x, int y, int prevX, int prevY, int pos) {
        if (pos == END || counter > target) return;

        char up = (y - 1 == -1 || (y - 1 == prevY && x == prevX)) ? TREE : m.get(y - 1).charAt(x);
        char left = (x - 1 == -1 || (x - 1 == prevX && y == prevY)) ? TREE : m.get(y).charAt(x - 1);
        char down = (y + 1 == m.size() || (y + 1 == prevY && x == prevX)) ? TREE : m.get(y + 1).charAt(x);
        char right = (x + 1 == m.get(y).length() || (y == prevY && x + 1 == prevX)) ? TREE : m.get(y).charAt(x + 1);

        int directionCounter = 0;
        if (up == ROAD || up == END) directionCounter++;
        if (left == ROAD || left == END) directionCounter++;
        if (down == ROAD || down == END) directionCounter++;
        if (right == ROAD || right == END) directionCounter++;
        if (directionCounter > 1) counter++;

        chooseDirection(END, up, left, down, right, x, y);
        chooseDirection(ROAD, up, left, down, right, x, y);
    }

    private static void chooseDirection(char statement, char up, char left, char down, char right, int x, int y) {
        if (up == statement) follow(x, y - 1, x, y, up);
        if (left == statement) follow(x - 1, y, x, y, left);
        if (down == statement) follow(x, y + 1, x, y, down);
        if (right == statement) follow(x + 1, y, x, y, right);
    }
}
