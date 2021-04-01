package MyLab5;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Main {

    public static int divCount(int n){
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
           if(n%i==0){
               cnt += 1;
           }
        }
        return cnt;
    }
    public static int pi(int n){
        int pi = 0;
        for (int i = 1; i <= n; i++) {
            if (divCount(i) == 2) {
                pi += 1;
            }
        }
        return pi;
    }

    public static int pi2(int n) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i=0;i<=n;i++){
            b.add(i, 1);
        }
        b.set(0, 0);
        b.set(1,0);

        for (int i = 2; i<sqrt(n); i++){
            if(b.get(i)==0) continue;
            int cnt =1;
            while(true){
                cnt+=1;
                if (i * cnt >= b.size()) {
                    break;
                }else{
                    b.set(i * cnt, 0);
                }
            }
        }
        int result =0;
        for(int i : b){
            result += i;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 계산하기 전 시간
        long timeStamp = System.currentTimeMillis();
        int pcnt = pi2(n);
        // 경과 시간
        long elapsedTime = System.currentTimeMillis() - timeStamp;
        System.out.println("pi("+n+")="+pcnt);
        System.out.println("Elapsed time is "+ elapsedTime+"ms");


    }
}
