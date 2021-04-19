package MyLab6;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class Stack1 {
    int[] stack;
    int top;
    Stack1() {
        stack = new int[100];
        top = -1;
    }
    void push(int e) {
        stack[++top] = e;
    }

    int top() {
        return stack[top];
    }
    void pop() {
        top -= 1;
    }
    boolean isEmpty() {
        return top == -1;
    }


}


public class ex01 {
    public static void main(String[] args) {

    }
}
