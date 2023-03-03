package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CavityMap {
    private final List<Coordinates> coordinates = new ArrayList<>();

    public List<String> cavityMap(List<String> grid) {
        if (grid.size() < 3) return grid;

        IntStream.range(1, grid.size() - 1).boxed()
                .forEach(i -> {
                    String s = grid.get(i);
                    int c;
                    int j = 1;
                    while (j != s.length() - 1) {
                        int num = Integer.parseInt(s.substring(j - 1, j + 2));
                        c = (num / 10) % 10;
                        if (c > num / 100 && c > num % 10
                                && c > Integer.parseInt(grid.get(i - 1).substring(j, j + 1))
                                && c > Integer.parseInt(grid.get(i + 1).substring(j, j + 1))) {
                            coordinates.add(new Coordinates(i, j));
                        }
                        j++;
                    }
                });
        coordinates.forEach(c -> grid.set(c.line, new StringBuilder(grid.get(c.line)).replace(c.pos, c.pos + 1, "X").toString()));
        return grid;
    }

    static class Coordinates {
        int line;
        int pos;

        Coordinates(int line, int pos) {
            this.line = line;
            this.pos = pos;
        }
    }
}
