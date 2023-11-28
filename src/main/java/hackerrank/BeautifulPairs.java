package hackerrank;

import java.util.List;

public class BeautifulPairs {
    public static int beautifulPairs(List<Integer> aList, List<Integer> bList) {
        if (aList.size() < 2) return aList.get(0).equals(bList.get(0)) ? 0 : 1;

        aList.sort(Integer::compareTo);
        bList.sort(Integer::compareTo);
        int i = -1;
        int j = 0;
        int beautifulNum = 0;
        while (++i < aList.size() && j < bList.size()){
            if (aList.get(i).equals(bList.get(j))) {
                beautifulNum++;
                j++;
            } else if (aList.get(i) > bList.get(j)) {
                i--;
                j++;
            }
        }

        return aList.size() > beautifulNum ? beautifulNum + 1 : beautifulNum;
    }
}
