package Algorithm.Lec0908;
// 재귀함수를 이용한 이진 탐색
public class Lec_0908_4 {
    public static int binarySearch(int[] A, int first, int last, int target) {
        int result = 0;
        if (first > last) {// 찾지 못한 경우
            result = -1;
        } else {
            //중간요소의 인덱스를 구함
            int mid = (first + last) / 2;

            if (target == A[mid]) {
                result = mid;
            } else if (target < A[mid]) {
                result = binarySearch(A, first, mid - 1, target);
            } else {
                result = binarySearch(A, mid + 1, last, target);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] A = {10, 12, 13, 14, 18, 20, 25, 27, 30, 35, 40, 45, 47};
        int x = 18;
        int n = A.length;
        int location = 0;

        location = binarySearch(A, 0, n - 1, x);
        System.out.println(x + "의 index = " + location);
    }
}
