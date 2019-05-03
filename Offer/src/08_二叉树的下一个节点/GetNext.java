
public class GetNext {
    //二叉树的下一个节点

    /**
     * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
     * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
     * <p>
     * 1、如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点
     * 2、否则，向上找第一个左链接指向的树包含该节点的parent节点
     */

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        //右子树不为空
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null)
                node = node.left;
            return node;
        } else {
            //右子树为空
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }
}



