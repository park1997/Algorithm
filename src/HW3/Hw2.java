package HW3;

import java.util.Scanner;

public class Hw2 {
    public static String[] v;
    public static String[] temp;
    public static boolean compare(String a, String b) {
        int min_num = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < min_num; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                continue;
            }else if (a.charAt(i) < b.charAt(i)) {
                return true;
            } else if (a.charAt(i) > b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && compare(v[p],v[q]))) {
                    temp[idx++] = v[p++];
                } else {
                    temp[idx++] = v[q++];
                }
            }

            for (int i = start; i <= end; i++) {
                v[i] = temp[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        v = new String[num];
        temp = new String[num];
        for (int i = 0; i < num; i++) {
            v[i] = sc.next();
        }
        mergeSort(0,num-1);
        for (int i = 0; i < num; i++) {
            System.out.println(v[i]);
        }


    }
}
