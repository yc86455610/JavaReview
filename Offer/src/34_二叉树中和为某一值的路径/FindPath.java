import java.util.ArrayList;

import TestTreeNode.TreeNode;

public class FindPath {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        int target = 10;
        TreeNode root = new TreeNode(10);
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