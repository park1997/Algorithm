package MyLab14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 선택정렬 : 배열에서 아직 정렬되지 않은 부분의 원소들 중에서
 최솟값을 선택하여 정렬된부분의 바로 오른쪽 원소와 교환하는 정렬 알고리즘
 O(N**2)
 */
/*
삽입정렬은 배열이 정렬된 부분과 정렬되지 않은 부분으로 나뉘며 정렬 안된 부분의
가장 왼쪽원소를 정렬된 부분에 삽입하는 방식의 정렬 알고리즘
O(N**2)
 */
public class Main {

    static void selection_sort(int[] v, int n) {

        for (int i = 0; i < n; i++) {
            int min = v[i];
            int temp;
            for (int j = i; j < n; j++) {
                if (min > v[j]) {
                    temp = min;
                    min = v[j];
                    v[j] = temp;
                }
            }
//            System.out.println(Arrays.toString(v));
        }
    }
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
            v[i] = rand.nextInt(1000000);
        }
        long ts = System.currentTimeMillis();
        // sorting...
//        selection_sort(v, n);
        insertion_sort(v,n);
        ts  = System.currentTimeMillis() -ts;
        for (int i = 0; i < 10; i++) {
            System.out.println(v[i]);
        }

        System.out.println("Elapsed time is " + ts + "ms.");


    }
}
