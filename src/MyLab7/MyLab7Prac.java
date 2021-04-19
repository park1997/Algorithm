package MyLab7;

class Node1 {
    int data;
    Node1 next;
    Node1(int e) {
        next = null;
        this.data = e;
    }

}

class Stack2{
    Node1 head;

    Stack2(int e) {
        Node1 node = new Node1(e);
        node.next = head;
        head = node;
    }
    int top() {
        return head.data;
    }
    void pop() {
        head = head.next;
    }
}



public class MyLab7Prac {
    public static void main(String[] args) {

    }
}
