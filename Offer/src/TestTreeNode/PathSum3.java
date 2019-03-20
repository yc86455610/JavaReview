package TestTreeNode;

//统计路径和等于一个数的路径数量
public class PathSum3 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int ret = pathSum(root.left, sum) + pathSum(root.right, sum) + pathSumStartWithRoot(root, sum);
        return ret;
    }

    public int pathSumStartWithRoot(TreeNode root, int sum) {
        if (root == null) return 0;
        int ret = 0;
        if (root.val == sum) ret++;
        ret += pathSumStartWithRoot(root.left, sum - root.val) + pathSumStartWithRoot(root.right, sum - root.val);
        return ret;
    }
}
