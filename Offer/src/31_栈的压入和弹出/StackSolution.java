//栈的压入和删除
//压入12345， 弹出 45321


import java.util.Stack;

public class StackSolution {
    public static void main(String[] args) {
        int[] pushSequence = {1, 2, 3, 4, 5};
        int[] popSequence1 = {4, 5, 3, 2, 1};
        int[] popSequence2 = {4, 3, 5, 1, 2};

        Solution solution = new Solution();
        System.out.println(solution.IsPopOrder(pushSequence, popSequence1));
        System.out.println(solution.IsPopOrder(pushSequence, popSequence2));
    }
}

class Solution {
    public boolean IsPopOrder(int[] pushSequence, int[] popSequence) {
        Stack<Integer> stack = new Stack<>();
        int n = pushSequence.length;
        for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
            stack.push(pushSequence[pushIndex]);
            while (popIndex < n && !stack.isEmpty() && stack.peek() == popSequence[pushIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}