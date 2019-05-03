import java.util.Stack;

public class MyQueue {
    //用栈实现队列
    //两个栈：输入栈，输出栈
    private Stack<Integer> stackA;
    private Stack<Integer> stackB;

    public MyQueue(){
        this.stackA = new Stack<>();
        this.stackB = new Stack<>();
    }

    public void push(int x ) {
        stackA.push(x);
    }


    public int pop(){
        if(!stackB.empty()){
            return stackB.pop();
        }
        if(!stackA.empty()){
            while (!stackA.isEmpty()){
                stackB.push(stackA.pop());
            }
            return stackB.pop();
        }
        return -1;
    }

    public int peek(){
        if(!stackB.empty()){
            return stackB.peek();
        }
        if(!stackA.empty()){
            while (!stackA.empty()){
                stackB.push(stackA.pop());
            }
            return stackB.peek();
        }
        return -1;
    }

    public boolean empty(){
        if(stackA.empty() && stackB.empty()){
            return true;
        }
        return false;
    }
}
