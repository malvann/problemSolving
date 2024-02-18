package leetcode;

import java.util.LinkedList;

public class FurthestBuildingYouCanReach {
    private final LinkedList<Integer> resources = new LinkedList<>();
    private int bricks;
    private int ladders;

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        this.bricks = bricks;
        this.ladders = ladders;

        int resource;
        for (int i = 0; i < heights.length - 1; i++) {
            resource = Math.max(0, heights[i + 1] - heights[i]);
            if (resource == 0) continue;
            if (!isReachable(resource)) return i;
        }
        return heights.length - 1;
    }

    private boolean isReachable(int resource) {
        if (resources.isEmpty()) resources.add(resource);
        else resources.add(getIndex(0, resources.size() - 1, resource), resource);
        resources.sort(Integer::compareTo);

        if (ladders >= resources.size()) return true;
        int integer = resources.stream()
                .limit(Math.max(0, resources.size() - ladders))
                .reduce(Integer::sum).orElse(0);
        return bricks >= integer;
    }

    private int getIndex(int from, int to, int target) {
        if (from == to) return from + 1;
        int middle = from + (to - from) / 2;
        return (resources.get(middle) >= target)
                ? getIndex(from, middle, target)
                : getIndex(middle + 1, to, target);
    }
}
