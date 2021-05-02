package MyLab12;
// 요세푸스 문제
import java.util.Scanner;

public class Main {
    static void printJosepus(int n, int k) {
        // a. add 1~n numbers into the queue
        // b. while queue is not empty
        // c. - get k-1 numbers from queue.
        // d. - put k-1 numbers into queue.
        // e. - get a number from queue.
        // f. - print the number
        int size = n + 1;
        int[] queue = new int[size];
        int head = 0, tail = 0;
        for (int i = 1; i <= n; i++) {
            queue[tail++] = i;
        }
        while (head != tail) {
            for (int i = 1; i < k; i++) {
                queue[tail] = queue[head];
                tail = (tail + 1) % size;
                head = (head + 1) % size;
            }
            System.out.println(queue[head]);
            head = (head + 1) % size;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printJosepus(n, k);
    }
}
