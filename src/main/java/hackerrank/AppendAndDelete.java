package hackerrank;

public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        if (s.length() + t.length() <= k) return "Yes";

        int counter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (i == s.length() || s.charAt(i) != t.charAt(i)) break;
            counter++;
        }
        int res = s.length() - counter + t.length() - counter;

        return (res == k || (res < k && ((k - res) % 2) == 0))
                ? "Yes"
                : "No";
    }
}
