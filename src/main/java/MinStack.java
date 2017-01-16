import java.util.Stack;

/**
 * Created by wei4liverpool on 1/16/17.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 Example:
 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> Returns -3.
 minStack.pop();
 minStack.top();      --> Returns 0.
 minStack.getMin();   --> Returns -2.

 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;


    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<Integer>();
        minStack=new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()){
            minStack.add(x);
        }else{
            if(minStack.peek()>x){
                minStack.add(x);
            }
        }
    }

    public void pop() {
        if(stack.peek()==minStack.peek()){
            minStack.pop();
        }
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("minStack:" + minStack.getMin());
        minStack.pop();
        System.out.println("minStack:" + minStack.top());

        System.out.println("minStack:"+minStack.getMin());





    }





}
