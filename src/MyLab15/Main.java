package MyLab15;

import java.util.Random;
import java.util.Scanner;

public class Main {
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
    static void mergeSort(int[] v,int from, int to) {
        int c = (from + to) / 2;
        selectionSort(v, from, c);
        selectionSort(v, c + 1, to);
        int[] t = new int[to + 1];
        int i = from, j = c+1, k=from;
        while (i <= c && j <= to) {
            if (v[i] < v[j]) {
                t[k++] = v[i++];
            } else {
                t[k++] = v[j++];
            }
        }
        while (i <= c) {
            t[k++] = v[i++];
        }
        while (j <= to) {
            t[k++] = v[j++];
        }
        for (i = from; i <= to; i++) {
            v[i] = t[i];
        }
    }
    static void mergeSort(int[] v, int n) {
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
        mergeSort(v, n);
        ts = System.currentTimeMillis() - ts;
        for (int i = 0; i < 10; i++) {
            System.out.println(v[i]);
        }
        System.out.println("Elapse time is "+ts+"ms.");


    }
}
