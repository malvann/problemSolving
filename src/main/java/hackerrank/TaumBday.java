package hackerrank;

public class TaumBday {
    /**
     * @param b  - amount of black presents
     * @param w  - amount of white presents
     * @param bc - black present price
     * @param wc - white present price
     * @param zc - exchange price
     * @return amount to bue b number of black & w number of white presents
     */
    public static long taumBday(int b, int w, int bc, int wc, int zc) {
        if (wc > bc && (bc + zc) < wc) return (long) b * bc + (long) w * (bc + zc);
        if (bc > wc && (wc + zc) < bc) return (long) w * wc + (long) b * (wc + zc);
        return (long) b * bc + (long) w * wc;
    }
}
