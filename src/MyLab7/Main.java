package MyLab7;

import java.util.Scanner;

// 이번엔 단일 연결리스트로 스택을 만들거임!
class Node{
    int data;
    Node next;
    public Node(int e) {
        this.data = e;
        next = null;
    }
}

class Stack {
    Node head;
    public Stack() {
        head = null;
    }
    void push(int e) {
        Node node = new Node(e);
        node.next = head; // 헤드가 원래 보고있었애가 새로만들어진 노드의 다음값임
        head = node; // 헤드에 현재 노드 저장
    }
    int top() {
        return head.data;
    }
    void pop() {
        head = head.next; // 헤드가
    }
    boolean empty() {
        return head == null;
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
