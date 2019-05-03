
public class hasPath {
    /**
     * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
     * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
     * <p>
     * 例如下面的矩阵包含了一条 bfce 路径。
     * <p>
     * 使用回溯法
     */


    public static void main(String[] args) {

    }
}

class Solution12 {
    private int rows;
    private int cols;
    private final static int[][] next = {};

    public boolean hasPath(char[] array, int rows, int cols, char[] str) {
        if (rows == 0 || cols == 0)
            return false;
        return true;
    }
}


