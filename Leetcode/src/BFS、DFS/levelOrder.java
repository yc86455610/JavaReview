import java.lang.reflect.Array;
import java.util.*;

public class levelOrder {
    //二叉树的层次遍历
    //BFS
    public static void main(String[] args) {
        //实例化二叉树
        TreeNode root = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);

        root.left = treeNode1;
        root.right = treeNode2;

        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        List<List<Integer>> result = new ArrayList<>();
        solution_levelOrder solution_levelOrder = new solution_levelOrder();
        System.out.println(solution_levelOrder.levelOrder(root));
    }
}

class solution_levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> curLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curNode = queue.poll();
                curLevel.add(curNode.val);
                if (curNode.left != null)
                    queue.add(curNode.left);
                if (curNode.right != null)
                    queue.add(curNode.right);
            }
            result.add(curLevel);
        }
        return result;
    }
}