import TestTreeNode.TreeNode;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class reConstructBinaryTree {
    //根据前序遍历和中序遍历，重建二叉树
    //根据前序遍历根节点在第一位的特点，拆分中序遍历中左子树和右子树

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre | startIn > endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                root.left = reConstructBinaryTree(pre, startPre + 1, i - startIn + startPre, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return root;
    }
}
