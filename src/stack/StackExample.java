package stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackExample {

    LinkedList linkedList = new LinkedList();


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
    }

    void push(int n) {
        linkedList.addFirst(n);
    }

    Object pop() {
        return linkedList.remove(0);
    }

    Object peek() {
        return linkedList.peek();
    }


}
