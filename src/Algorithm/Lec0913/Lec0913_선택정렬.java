package Algorithm.Lec0913;

import java.util.Arrays;

public class Lec0913_선택정렬 {
    public static void main(String[] args) {
        int[] intArray = {89, 45, 67, 92, 74, 26, 90};
        int i;
        // 정렬하기 전 배열을 출력한다
        System.out.println(Arrays.toString(intArray));

        // 선택정렬을 사용하기위해 selectionSort 메소드를 호출함
        selectionSort(intArray);

        // 정렬한 후 배열을 출력한다
        System.out.println(Arrays.toString(intArray));
    }

    private static void selectionSort(int[] A) {
        int i, j, min, temp;
        int n = A.length;
        for (i = 0; i < n - 1; i++) {
            // A[i]부터 A[n-1]의 원소들 중 최소값의 인덱스를 찾는다
            min = i;
            for (j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;    // 최소값 index만 업데이트함
                }
            }
            // 실제 값 교환은 여기서 일어남
            temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
}
