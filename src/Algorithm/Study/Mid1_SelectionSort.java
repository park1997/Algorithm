package Algorithm.Study;

import org.w3c.dom.ls.LSOutput;

public class Mid1_SelectionSort {
    public static void selectionSort(int[] A) {
        int i, j, min, temp;
        int n = A.length;

        for (i = 0; i < n - 1; i++) {
            // A[i]부터 A[n-1] 의 요소들 중 최솟값의 지수를 찾는다
            min = i;
            for (j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] intArray = {89, 45, 67, 92, 39, 74, 26, 90};
        int i;

        // 정렬하기전 배열을 출력한다
        System.out.print("정렬 전 배열:");

        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        // 선택 정렬을 사용하여 정렬하기 위해 selectionSrot 메소드를 호출한다
        selectionSort(intArray);

        // 정렬한 후 배열을 출력한다
        System.out.print("\n정렬 후 배열 :");

        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
