package leetcode;

import leetcode.util.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoBinaryTreesTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(TreeNode root1, TreeNode root2, TreeNode result) {
        assertEquals(result, new MergeTwoBinaryTrees().mergeTrees(root1, root2));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(
                        new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2)),
                        new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7))),
                        new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7)))
                ));
    }
}