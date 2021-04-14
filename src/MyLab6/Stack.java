package MyLab6;
import java.util.Arrays;
import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    public Node(int e) {
        this.data = e;
        this.next = null;
    }
}

class Stack {
    Node head;
    Stack() {
        head = null;
    }
    void push(int e) {
        Node node = new Node(e);
        node.next = head;
        head = node;
    }
    void pop() {
        head = head.next;
    }
    int top() {
        return head.data;

    }
    boolean empty() {
        return head == null;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack stack = new Stack();
        for(int i=0; i<10; i++) {
            stack.push(scan.nextInt());
        }
        while(stack.empty()==false) {
            System.out.println(stack.top());
            stack.pop();
        }
    }
}
