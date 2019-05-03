import java.util.ArrayList;

import TestTreeNode.TreeNode;

public class FindPath {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        TreeNode root = new TreeNode(10);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(12);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(7);
        root.left = treeNode1;
        root.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        int target = 22;
        System.out.println(solution34.FindPath(root, target));
    }
}


class Solution34 {
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) return;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<>(path));
        } else {
            backtracking(root.left, target, path);
            backtracking(root.right, target, path);
        }
        path.remove(path.size() - 1);
    }
}