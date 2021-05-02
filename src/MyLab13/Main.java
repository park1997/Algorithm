package MyLab13;

import java.util.Scanner;
// 재귀 함수
public class Main {
    static long sum(int n) {
        // Initial condition
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum from 1 to " + n + " is " + sum(n));

    }
}
