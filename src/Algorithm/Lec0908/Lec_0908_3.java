package Algorithm.Lec0908;

import java.util.Scanner;

// 이진 탐색
public class Lec_0908_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};
        int x = sc.nextInt();
        int n = A.length;
        int loc = 0;
        int start = 0;
        int end = n;
        boolean key = false;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (A[mid] > x) {
                end = mid-1;
            } else if (A[mid] < x) {
                start = mid+1;
            } else if (A[mid] == x) {
                loc = mid;
                key = true;
                break;
            }
        }
        if (key) {
            System.out.println("탐색 성공 "+n+"의 index 값은 " + loc);
        } else {
            System.out.println("탐색 실패 "+n+"이란 수를 찾을 수 없습니다!");
        }

    }
}
