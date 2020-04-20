package _1;

import java.util.Stack;

class MyStack1 {
    private final Stack<Integer> stackData;
    private final Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(final int newNum) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getmin()) {
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        final int value = this.stackData.pop();
        if (value == this.getmin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public int getmin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}

public class getMin {
    public static void main(final String[] args) {
        final MyStack1 a1 = new MyStack1();
        a1.push(2);
        a1.push(1);
        a1.push(5);
        a1.push(0);
        a1.push(-9);
        a1.push(3);
        a1.push(10);
        final int a2 = a1.getmin();
        System.out.println(a2);

    }

}