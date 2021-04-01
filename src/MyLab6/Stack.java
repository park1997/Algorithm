package MyLab6;

import java.util.Arrays;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int e){
        data = e;
        next = null;
    }
}


class Stack {
    Node head;

    int[] stack;
    int top;

    Stack() {
        stack = new int[100];
        top = -1;
    }

    void push(int e) {
        if (this.top == -1) {
            this.top = 0;
            this.stack[this.top] = e;
            this.top += 1;
        } else {
            this.stack[this.top] = e;
            top += 1;
        }
    }

    int top() {
        return this.stack[this.top];
    }

    void pop() {
        this.stack[this.top] = Integer.parseInt(null);
    }

    boolean empty() {
        if (this.stack.length == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println(Arrays.toString(stack.stack));


    }
}
