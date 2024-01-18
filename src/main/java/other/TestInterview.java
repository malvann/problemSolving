package other;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.Iterator;

public class TestInterview {
    //left - 0,1,2,3
    //right - 1,1,2,2
    //output - 0,1,1,1,2,2,2,3
    public Iterator<Integer> mergeSortedIterators(Iterator<Integer> left, Iterator<Integer> right) {
        return new CIter(left, right);
    }

    @RequiredArgsConstructor
    public class CIter implements Iterator<Integer> {
        private final Iterator<Integer> left;
        private final Iterator<Integer> right;

        private Integer lBuff;
        private Integer rBuff;

        public boolean hasNext() {
            return left.hasNext() || right.hasNext();
        }

        @SneakyThrows
        public Integer next() {
            if (lBuff == null && left.hasNext()) lBuff = left.next();
            if (rBuff == null && right.hasNext()) rBuff = right.next();

            if (lBuff == null && rBuff == null) throw new NoSuchFieldException();

            Integer res;
            if (lBuff == null) {
                res = rBuff;
                rBuff = null;
            } else if (rBuff == null) {
                res = lBuff;
                lBuff = null;
            } else {
                if (lBuff < rBuff) {
                    res = lBuff;
                    lBuff = null;
                } else {
                    res = rBuff;
                    rBuff = null;
                }
            }
            return res;
        }
    }
}
