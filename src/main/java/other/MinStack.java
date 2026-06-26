package other;

import java.util.*;

public class MinStack {
    private Integer min;
    private final List<Integer> stack;

    public MinStack() {
        this.stack = new ArrayList<>();
    }

    public void push(int val) {
        if (Objects.isNull(min) || min > val) min = val;
        stack.add(val);
    }

    public void pop() {
        if (stack.isEmpty()) return;

        Integer last = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        if (Objects.nonNull(last) && last.equals(min)) {
            stack.stream().min(Integer::compareTo).ifPresentOrElse(num -> min = num, () -> min = null);
        }
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
