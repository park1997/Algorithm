package MyLab15;

import java.util.Random;
import java.util.Scanner;
// 2**127 => 128 * 10**36과 비슷하다
// 2*10 을 1000이라고 생각하기
public class Main2 {
    // O(n**2)
    static void selectionSort(int[] v, int from, int to) {
        for (int i = from; i < to; i++) {
            int min = i;
            for (int j = i + 1; j <= to; j++) {
                if (v[min] > v[j]) {
                    min = j;
                }
            }
            int t = v[min];
            v[min] = v[i];
            v[i] = t;
        }
    }
    static void selectionSort(int[]v , int n) {
        selectionSort(v,0,n-1);
    }

    // 재귀적인 관점에서의 mergesort
    // 재귀적 관점은 초기 조건이 있어야함!
    static int[] t;
    // O(nlogn)
    // T(N) = 2T(N/2) +N
    // T(N) 을 nlogn이라고 했을때 식넣어보면 성립함
    static void mergeSort(int[] v,int from, int to) {
        // 재귀적 관점의 초기 조건(탈출조건)
        if (from == to) {
            return;
        }
        int c = (from + to) / 2;
        mergeSort(v, from, c);
        mergeSort(v, c + 1, to);
        // 이게 여기있으면 배열을 계속 만들기때문에 시간적 효율에 좋지 않다
//        int[] t = new int[to + 1];
        int i = from, j = c+1, k=from;
        while (i <= c && j <= to) {
            if (v[i] <= v[j]) {
                t[k++] = v[i++];
            } else {
                t[k++] = v[j++];
            }
        }
        // 남은부분들 이어서 붙혀줘야함
        while (i <= c) {
            t[k++] = v[i++];
        }
        while (j <= to) {
            t[k++] = v[j++];
        }
        // 원래 리스트에 덮어쓰기
        for (i = from; i <= to; i++) {
            v[i] = t[i];
        }
    }
    static void mergeSort(int[] v, int n) {
        t = new int[n];
        mergeSort(v, 0, n - 1);
    }
    public static void main(String[] args) {
        Random rand = new Random(100);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = rand.nextInt(1000000);
        }
        long ts = System.currentTimeMillis();
//        selectionSort(v,n);
        mergeSort(v, n);    // 선택정렬보다 효율이 좋아졌음
        ts = System.currentTimeMillis() - ts;
        for (int i = 0; i < 10; i++) {
            System.out.println(v[i]);
        }
        System.out.println("Elapse time is "+ts+"ms.");


    }
}
