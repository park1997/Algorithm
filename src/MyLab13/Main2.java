package MyLab13;

import java.util.Scanner;
// 하노이 탑
/*
이 프로그램의 시간복잡도는??
전체를 T(N)이라고 하면
T(1) = O(1)
T(n) = 2*T(n-1) + T(1)
T(n) = 2*T(n-1) + O(1) 이걸 풀면
T(n) = O(2**n)이게됨

 */
public class Main2 {
    static void hanoi(int n, char a, char b, char c) {
        // Initial condition
        if (n == 1) {
            System.out.println(a+" -> "+b); // O(1)
            return;
        }
        // Induction part
        hanoi(n - 1, a, c, b); // T(n-1)
        hanoi(1, a, b, c);  // T(1)
        hanoi(n - 1, c, b, a);  // T(n-1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 'a', 'b', 'c');

    }
}
