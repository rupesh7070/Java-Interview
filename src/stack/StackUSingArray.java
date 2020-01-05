package stack;

import java.util.Stack;

public class StackUSingArray {

    Integer[] numbers;
    int capacity;
    int counter;

    public StackUSingArray() {
        capacity = 2;
        numbers = new Integer[capacity];
        counter = 0;
    }

    public void push(int num) {
        if (counter == capacity - 1) {
            capacity = capacity * 2;
            Integer[] newNumbers = new Integer[capacity];
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;

        }
        this.numbers[this.counter] = num;
        this.counter = this.counter + 1;

    }

    public int peek() {
        return this.numbers[counter - 1];
    }

    public int pop() {
        int out = this.numbers[counter - 1];
        counter = counter - 1;
        return out;
    }

    public boolean isEmpty() {
        if (this.counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        StackUSingArray stackUSingArray = new StackUSingArray();
        stackUSingArray.push(10);
        stackUSingArray.push(15);
        stackUSingArray.push(20);
        System.out.println(stackUSingArray.pop());
        System.out.println(stackUSingArray.pop());
        System.out.println(stackUSingArray.isEmpty());
        System.out.println(stackUSingArray.peek());
        System.out.println(stackUSingArray.pop());
        System.out.println(stackUSingArray.isEmpty());
        stackUSingArray.push(22);
        System.out.println(stackUSingArray.peek());
    }

}
