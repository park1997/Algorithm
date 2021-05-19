package MyLab16;

import java.util.Random;
import java.util.Scanner;
// 재귀적 관점
public class Main2 {
    static long histogram(int[] v, int from,int to) {
        long max = 0;
        for (int i = from; i <= to; i++) {
            long min = v[i];
            for (int j = i; j <= to; j++) {
                if (v[j] < min) {
                    min = v[j];
                }
                long s = min * (j - i + 1);
                if (s > max) {
                    max = s;
                }
            }
        }
        return max;
    }
    static long histogram(int[] v,int n) {
        return histogram(v,0,n-1);
    }



    static long dchistogram(int[] v, int n) {
        return dchistogram(v, 0, n - 1);
    }
    static long dchistogram(int[] v, int from, int to) {
        // 초기 조건
        if (from == to) {
            return v[from];
        }
        int c = (from + to) / 2;
        long a = dchistogram(v, from, c);
        long b = dchistogram(v, c + 1, to);
        long max =(a>b)?a:b;
        long min = (v[c] < v[c + 1]) ? v[c] : v[c + 1];
        if (max < min * 2) {
            max = min * 2;
        }
        int i = c - 1, j = c + 2;
        while (i >= from && j <= to) {
            if (v[i] > v[j]) {
                if (v[i] < min) {
                    min = v[i];
                }
                i -= 1;
            }else{
                if (v[j] < min) {
                    min = v[j];
                }
                j += 1;
            }
            if (max < min * (j - i - 1)) {
                max = min * (j - i - 1);
            }
        }
        while (i >= from) {
            if (v[i] < min) {
                min = v[i];
            }
            i -= 1;
            if (max < min * (j - i - 1)) {
                max = min * (j - i - 1);
            }
        }
        while (j <= to) {
            if (v[j] < min) {
                min = v[j];
            }
            j += 1;
            if (max < min * (j - i - 1)) {
                max = min * (j - i - 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random(100);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = rand.nextInt(1000);
        }

        long ts = System.currentTimeMillis();
//        long r = histogram(v, n);
        long r = dchistogram(v, n);
        ts = System.currentTimeMillis() - ts;

        for (int i = 0; i < 10 && i < n; i++) {
            System.out.println(v[i]);
        }

        System.out.println("Result is "+r);
        System.out.println("Elapsed time is "+ts+"ms.");
    }
}
