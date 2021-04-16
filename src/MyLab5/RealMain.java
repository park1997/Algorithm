package MyLab5;

import java.util.Scanner;
// 교수님 코드
public class RealMain {

    // 어떤값 n에대해서 약수의 개수
    // 좀 많이 비효율 적인 방법임 모든걸 검사하기 때문
    static int divCount(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }

    // n보다 작거나같은 소수의 개수를 반환하는 함수
    static int pi(int n){
        int pi = 0;
        for (int i = 1; i <= n; i++) {
            // 약수의개수가 2이면(=소수이면) pi+=1
            if (divCount(i) == 2) {
                pi += 1;
            }
        }
        return pi;
    }
    // O(N(N)^(1/2))
    static int pi2(int n) {
        int pi=0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j*j < i; j++) { // 제곱근까지만 돌리자!
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                pi += 1;
            }
        }
        return pi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long timeStamp = System.currentTimeMillis();
        int pcnt = pi(n);
        long elapaseTime = System.currentTimeMillis() - timeStamp;
        System.out.println("pi("+n+")="+pcnt);
        System.out.println("Elapsed time is "+elapaseTime+"ms");


    }
}
