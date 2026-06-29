package other;

import java.util.PriorityQueue;
import java.util.Queue;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length < 2) return position.length;

        Queue<PosTimePair> ordering = new PriorityQueue<>((o1, o2) -> o2.position - o1.position);
        for (int i = 0; i < position.length; i++) {
            double time = (double) (target - position[i]) / speed[i];
            ordering.add(new PosTimePair(position[i], time));
        }
        int fleetCounter = 1;
        PosTimePair prev = ordering.poll();
        PosTimePair curr;

        while (!ordering.isEmpty()) {
            curr = ordering.poll();
            if (prev.time < curr.time) {
                fleetCounter++;
                prev = curr;
            }
        }
        return fleetCounter;
    }

    record PosTimePair(int position, double time) {
    }
}
