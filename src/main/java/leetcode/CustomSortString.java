package leetcode;

public class CustomSortString {
    public String customSortString(String order, String s) {
        String s1 = order.replaceAll("[^%s]".formatted(s), "");
        for (char ch : order.toCharArray()) {
            s = s.replaceFirst(String.valueOf(ch), "");
        }
        StringBuilder sb = new StringBuilder(s1);
        for (char ch : s.toCharArray()) {
            int index = sb.lastIndexOf(String.valueOf(ch));
            if (index == -1) sb.append(ch);
            else sb.insert(index + 1, ch);
        }

        return sb.toString();
    }
}
