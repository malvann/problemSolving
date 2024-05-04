package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SmallestStringStartingFromLeaf {
    String[] alph = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    List<StringBuilder> list = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {
        if (root.left == null && root.right == null) return alph[root.val];
        if (root.left == null) return smallestFromLeaf(root.right).concat(alph[root.val]);
        if (root.right == null) return smallestFromLeaf(root.left).concat(alph[root.val]);
        String lRes = smallestFromLeaf(root.left).concat(alph[root.val]);
        String rRes = smallestFromLeaf(root.right).concat(alph[root.val]);
        return lRes.compareTo(rRes) < 0 ? lRes : rRes;
    }
}
