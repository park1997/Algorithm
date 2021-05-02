package MyLab13;

import java.util.Scanner;

public class Main3 {
    static long fib(int n) {
        // Initial condition
        if (n == 1 || n == 2) {
            return 1;   // return 1 이 몇번 실행되는가에대해 생각해봐야함 그게 시간복잡도이 기때문
        }
        // Induction part
        return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("fibonacci("+n+") = "+fib(n));

    }
}
