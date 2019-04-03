import TestTreeNode.TreeNode;

public class testTree {
    //二叉树的深度
    public int TreeDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }

    //判断是否平衡二叉树
    private boolean isBalaned = true;

    public boolean isBalaned_Solution(TreeNode root) {
        height(root);
        return isBalaned;
    }

    private int height(TreeNode root) {
        if (root == null || !isBalaned)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            isBalaned = false;
        return 1 + Math.max(left, right);
    }
}
