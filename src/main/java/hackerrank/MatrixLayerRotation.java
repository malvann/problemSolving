package hackerrank;

import java.util.List;

import static hackerrank.MatrixLayerRotation.Direction.*;

public class MatrixLayerRotation {
    private List<List<Integer>> matrix;

    private int lx;
    private int rx;
    private int uy;
    private int dy;

    public void matrixRotation(List<List<Integer>> matrix, int r) {
        if (matrix.size() == 1 || matrix.get(0).size() == 1) return;
        this.matrix = matrix;

        uy = 0;
        dy = matrix.size() - 1;
        lx = 0;
        rx = matrix.get(0).size() - 1;

        while (dy - uy > 0 && rx - lx > 0) {
            circle(r);
            uy++;
            dy--;
            lx++;
            rx--;
        }
    }

    private void circle(int r) {
        Position start = new Position(lx, uy, DOWN);
        for (int k = r; k > 0; k--) {
            iteration(start, r);
            start = next(start, 1);
        }
    }

    private void iteration(Position start, int delta) {
        //0-0, 0-2, 1-3, 3-3, 3-1, 2-0, 0-0,
        Position current = next(start, delta);

        int buff;
        int newVal = matrix.get(start.y).get(start.x);
        while (!start.equals(current)) {
            buff = matrix.get(current.y).get(current.x);
            matrix.get(current.y).set(current.x, newVal);
            newVal = buff;
            current = next(current, delta);
        }
        matrix.get(current.y).set(current.x, newVal);
    }

    private Position next(Position position, int delta) {
        Position pos =
                switch (position.direction) {
                    case RIGHT -> new Position(position.x + delta, position.y, position.direction);
                    case UP -> new Position(position.x, position.y - delta, position.direction);
                    case LEFT -> new Position(position.x - delta, position.y, position.direction);
                    case DOWN -> new Position(position.x, position.y + delta, position.direction);
                };
        return normalize(pos);
    }

    private Position normalize(Position position) {
        Direction nextDirection = position.direction;
        int nextX = position.x;
        int nextY = position.y;

        switch (position.direction) {
            case RIGHT -> {
                if (nextX > rx) {
                    nextY -= nextX - rx;
                    nextX = rx;
                    nextDirection = UP;
                } else if (nextX == rx) nextDirection = UP;
            }
            case UP -> {
                if (nextY < uy) {
                    nextX -= uy - nextY;
                    nextY = uy;
                    nextDirection = LEFT;
                } else if (nextY == uy) nextDirection = LEFT;
            }
            case LEFT -> {
                if (nextX < lx) {
                    nextY += lx - nextX;
                    nextX = lx;
                    nextDirection = DOWN;
                } else if (nextX == lx) nextDirection = DOWN;
            }
            case DOWN -> {
                if (nextY > dy) {
                    nextX += nextY - dy;
                    nextY = dy;
                    nextDirection = RIGHT;
                } else if (nextY == dy) nextDirection = RIGHT;
            }
        }

        Position newPosition = new Position(nextX, nextY, nextDirection);
        return position.x <= rx && position.x >= lx && position.y >= uy && position.y <= dy
                ? newPosition
                : normalize(newPosition);
    }


    record Position(int x, int y, Direction direction) {
    }

    enum Direction {
        DOWN,
        RIGHT,
        UP,
        LEFT
    }
}
