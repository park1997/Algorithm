package MyLab14;

import java.util.Random;
import java.util.Scanner;
// 교수님 풀이
public class Main2 {
    // O(N**2) 알고리즘임
    static void selection_sort(int[] v, int n) {

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (v[min] > v[j]) {
                    min = j;
                }
                int temp = v[min];
                v[min] = v[i];
                v[i] = temp;
            }

//            System.out.println(Arrays.toString(v));
        }
    }
    // 삽입정렬은 정렬이 어느정도 되어있으면 상당히 빠르게 검사하는 특성이있음
    static void insertion_sort(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            int t = v[i];
            int s = i;
            while (s > 0 && v[s - 1] > t) {
                v[s] = v[s - 1];
                s -= 1;
            }
            // while 문을 빠져나올때의 s가 t가 들어갈 위치가 됨
            v[s] = t;
        }
    }


    public static void main(String[] args) {
        // 100은 seed임
        Random rand = new Random(100);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number :");
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
//            v[i] = rand.nextInt(1000000);
            /*
            이런 경우처럼 데이터의 어느정도 정렬의 방향성을 주었을때 는 삽입 정렬이 훨씬 유리하다 !!(중요!!!)
            보통 O(N)의 시간이 필요하게 만들어 지기 때문
             */
            v[i] = i + rand.nextInt(1000); // 전체적으로 어느 정도 증가하는 형태
        }
        long ts = System.currentTimeMillis();
        // sorting...
        selection_sort(v, n);
//        insertion_sort(v, n);
        ts  = System.currentTimeMillis() -ts;
        for (int i = 0; i < 10; i++) {
            System.out.println(v[i]);
        }
        System.out.println("Elapsed time is " + ts + "ms.");
    }
}
