package MyLab6;

// Stack 교수님 풀이
import java.util.Scanner;

class Stack {
    int[] stack;
    int top;
    public Stack() {
        stack = new int[100];
        top = -1;
    }
    void push(int e) {
        // Increase top by 1
        top += 1;
        stack[top] = e;
    }
    int top() {
        return stack[top];
    }
    void pop() {
        top -= 1;
    }
    boolean empty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push (sc.nextInt());
        }

        while (!stack.empty()) {
            System.out.println(stack.top());
            stack.pop();
        }
    }
}
