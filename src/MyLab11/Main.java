package MyLab11;

import java.util.Scanner;
// 이중연결리스트로 작성하기
// 교수님 풀이

class Node{
    public int data;
    public Node prev, next;
    Node(int e) {
        data =e;
        prev = next = this;
    }
}

class Queue{
    Node root;
    Queue(){
        root = new Node(0);
    }
    void add(int e) {
        Node node = new Node(e);
        node.next = root;
        node.prev = root.prev;
        root.prev.next = node;
        root.prev = node;
    }
    void remove() {
        root.next = root.next.next;
        root.next.prev = root;
    }
    int peek() {
        return root.next.data;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        while (true) {
            int v = sc.nextInt();
            if (v == -1) {
                break;
            }
            if (v != 0) {
                queue.add(v);
            } else {
                System.out.println("PEEK = "+queue.peek());
                queue.remove();
            }

        }

    }
}
