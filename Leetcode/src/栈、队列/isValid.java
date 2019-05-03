import java.util.Stack;

public class isValid {
    //判断是否是有效的括号
    public static void main(String[] args) {
        solution_isvalid solution_isvalid = new solution_isvalid();
        String str1 = "{([])}";
        String str2 = "(]";
        System.out.println(solution_isvalid.isValid(str2));
    }
}

class solution_isvalid {
    private boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (stack.size() == 0) {
                stack.push(aChar);
            } else if (isSym(stack.peek(), aChar)) {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        return stack.isEmpty();
    }
}