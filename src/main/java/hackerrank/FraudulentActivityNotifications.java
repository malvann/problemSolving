package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudulentActivityNotifications {
    private List<Integer> trainData;

    public int activityNotifications(List<Integer> expenditure, int trainingDays) {
        int notificationsCounter = 0;

        trainData = new ArrayList<>(expenditure.subList(0, trainingDays));
        Collections.sort(trainData);

        for (int i = trainingDays; i < expenditure.size(); i++) {
            if (getMaxAllowedAmount() < expenditure.get(i)) {
                notificationsCounter++;
                remove(expenditure.get(i - trainingDays), 0, trainData.size());
                insert(expenditure.get(i), 0, trainData.size());
            }
        }

        return notificationsCounter - 1;
    }

    private void remove(int sum, int from, int to) {
        int midInd = from + (to - from) / 2;
        if (trainData.get(midInd) == sum) trainData.remove(midInd);
        else if (trainData.get(midInd) > sum) remove(sum, from, midInd);
        else remove(sum, midInd, to);
    }

    private void insert(int sum, int from, int to) {
        int midInd = from + (to - from) / 2;
        if (trainData.get(midInd) < sum && (midInd + 1 == trainData.size() || trainData.get(midInd + 1) >= sum))
            trainData.add(midInd + 1, sum);
        else if (trainData.get(midInd) > sum) insert(sum, from, midInd);
        else insert(sum, midInd, to);
    }

    private int getMaxAllowedAmount() {
        return ((trainData.size() & 1) != 0)
                ? trainData.get(trainData.size() / 2)
                : (int) Math.ceil((float) (trainData.get(trainData.size() / 2 - 1) + trainData.get(trainData.size() / 2)) / 2);
    }
}
