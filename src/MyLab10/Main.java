package MyLab10;

import java.util.Scanner;

class Queue{
    static int N = 100;
    int[] data;
    int head, tail;

    //    생성자
    Queue() {
        data = new int[N];
        head = tail = 0;
    }
    void add(int e){
        data[tail] = e;
        tail = (tail + 1) % N;
    }
    // head만 한칸 오른쪽으로 옮기면 된다.
    void remove(){
        head = (head + 1) % N;
    }

    int peek() {
        return data[head];
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
            }
            else{
                System.out.println("PEEK = "+queue.peek());
                queue.remove();
            }
        }


    }
}
