
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class testBinaryTrees {
    public static void main(String[] args) {
        solutionBinaryTrees solutionBinaryTrees = new solutionBinaryTrees();

    }
}

class solutionBinaryTrees {
    /**
     * 94   中序遍历二叉树
     * 1、递归     2、迭代
     */

    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        return inorderTraversal(root, list);
    }

    private List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
        if (root.left != null)
            inorderTraversal(root.left, list);
        list.add(root.val);
        if (root.right != null)
            inorderTraversal(root.right, list);
        return list;
    }

    //迭代
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list1.add(root.val);
            root = root.right;
        }
        return list1;
    }

    /**105  从前序与中序遍历序列构造二叉树
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     *
     * */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

    }
}

