package leetcode;

import leetcode.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestStringStartingFromLeafTest {
    @ParameterizedTest
    @MethodSource
    void test(TreeNode nums, String res) {
        assertEquals(res, new SmallestStringStartingFromLeaf().smallestFromLeaf(nums));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new TreeNode(25, new TreeNode(1, new TreeNode(0, new TreeNode(1, new TreeNode(0), null), null), new TreeNode(0)), null), "ababz"),
                Arguments.of(new TreeNode(4, new TreeNode(0, new TreeNode(1), null), new TreeNode(1)), "bae"),
                Arguments.of(new TreeNode(2, new TreeNode(2, new TreeNode(1, new TreeNode(0), null), null), new TreeNode(1, new TreeNode(0), null)), "abc"),
                Arguments.of(new TreeNode(0, new TreeNode(1, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(3), new TreeNode(4))), "dba")
        );
    }
}