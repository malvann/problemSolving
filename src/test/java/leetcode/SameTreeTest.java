package leetcode;

import leetcode.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SameTreeTest {
    @ParameterizedTest
    @MethodSource
    void test(TreeNode p, TreeNode q, boolean result) {
        assertEquals(result, new SameTree().isSameTree(p, q));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new TreeNode(1, new TreeNode(2), new TreeNode(3)), new TreeNode(1, new TreeNode(2), new TreeNode(3)), true)
        );
    }
}