package io.kuleshov.stack;

public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full!");
        else stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is not full!");
            return 0;
        }
        return stck[tos--];
    }
}

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 5; i++) stack.push(i);
        System.out.println("My Stack is: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}

