package stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackImpl {
    LinkedList<Integer> elements;

    public StackImpl() {
        Stack stack = new Stack();
        stack.push(1);
        elements = new LinkedList();
    }

    public void push(int num) {
        elements.addFirst(num);
    }

    public int pop() {
        return elements.getFirst();
    }

    public int peek(){
        return elements.peek();
    }


}
