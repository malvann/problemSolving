package hackerrank;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        if (s.length() >= n) return s.chars().limit(n).parallel().filter(v -> v == 'a').count();

        long baseCount = s.chars().parallel().filter(v -> v == 'a').count();
        long baseResult = Math.floorDiv(n, s.length()) * baseCount;

        long restN = n - s.length() * Math.floorDiv(n, s.length());
        long restResult = s.chars().limit(restN).parallel().filter(v -> v == 'a').count();
        return baseResult + restResult;
    }
}
