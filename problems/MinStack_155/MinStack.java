package problems.MinStack_155;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minElements;

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(3);
        obj.push(-3);
        obj.push(-11);
        obj.push(0);
        obj.push(5);
        obj.push(3);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();

        System.out.println(param_3);
        System.out.println(param_4);
    }

    public MinStack() {
        stack = new Stack<>();
        minElements = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            minElements.push(val);
        } else {
            stack.push(val);
            int min = minElements.peek();
            if (val <= min)
                minElements.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        int i = stack.pop();
        if (minElements.peek() == i)
            minElements.pop();
    }

    public int top() {
        if (stack.isEmpty())
            return -1;

        return stack.peek();
    }

    public int getMin() {
        if (minElements.isEmpty())
            return -1;

        return minElements.peek();
    }
}
