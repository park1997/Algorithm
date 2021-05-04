import java.util.Scanner;

class Stack {
    char[] data;
    int top;

    Stack() {
        data = new char[100];
        top = -1;
    }
    void push(char e) {
        data[++top] = e;
    }
    char top() {
        return data[top];
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
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.println(stack.top());
            stack.pop();
        }



    }
}
