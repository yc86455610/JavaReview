public class VerifySquenceOfBST {
    //判断数组是否为某一二叉搜索树的后序遍历
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int[] sequence = {5, 7, 6, 9, 11, 10, 8};
        System.out.println(solution33.VerifySquenceOfBST(sequence));
    }
}

class Solution33 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int first, int last) {
        if (last - first <= 1)
            return true;
        int rootVal = sequence[last];
        int cutIndex = first;
        while (cutIndex < last && sequence[cutIndex] <= rootVal)
            cutIndex++;
        for (int i = cutIndex; i < last; i++)
            if (sequence[i] < rootVal)
                return false;
        return verify(sequence, first, cutIndex - 1) && verify(sequence, cutIndex, last - 1);
    }
}