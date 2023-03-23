package leetcode;

import leetcode.util.TreeNode;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    private TreeNode merge(TreeNode leftRoot, TreeNode rightRoot) {
        if (leftRoot == null && rightRoot == null) return null;
        if (leftRoot == null) return rightRoot;
        if (rightRoot == null) return leftRoot;

        TreeNode root = new TreeNode();
        root.setVal(leftRoot.getVal() + rightRoot.getVal());
        root.setLeft(merge(leftRoot.getLeft(), rightRoot.getLeft()));
        root.setRight(merge(leftRoot.getRight(), rightRoot.getRight()));
        return root;
    }
}
