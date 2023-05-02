package leetcode;

import org.junit.jupiter.api.Test;

class MyHashSetTest {
    @Test
    void test() {
        MyHashSet set = new MyHashSet();
        set.contains(72);
        set.remove(91);
        set.add(48);
        set.add(41);
        set.contains(96);
        set.remove(87);
        set.contains(48);
        set.contains(49);
        set.add(84);
        set.add(82);
        set.add(24);
        set.add(7);
        set.remove(56);
        set.add(87);
        set.add(81);
        set.add(55);
        set.add(19);
        set.add(40);
        set.add(68);
        set.add(23);
        set.add(80);
        set.add(53);
        set.add(76);
        set.contains(93);
        set.add(95);
        set.contains(95);

    }
}