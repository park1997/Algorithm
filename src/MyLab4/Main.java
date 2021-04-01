package MyLab4;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    static long sum(int n){
        long sum=0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static long advSum(int n){
        long s = n;
        return s * (s + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        현재 시간을 ms초 단위로 출력함
        long et = System.currentTimeMillis();
//        현재시간이 늘어남
        long sum = advSum(n);
//        현재 시간을 저장한 값을 빼줌(for loop의 시간을 출력해줌)
        et = System.currentTimeMillis() - et;
        System.out.println("Sum from 1 to " + n + " is " + sum);
        System.out.println("Elapsed time : " + et + "ms");

    }

}
