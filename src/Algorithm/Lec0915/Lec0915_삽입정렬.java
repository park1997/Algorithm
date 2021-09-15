package Algorithm.Lec0915;
import java.util.Arrays;

public class Lec0915_삽입정렬 {

    public static void insertionSort(int[] A) {
        int i, j, insertElement;
        int n = A.length;
        for (i = 1; i < n; i++) {
            // 배열을 재배열하여 정렬한다
            insertElement = A[i]; // A[i]를 저장한다
            j = i - 1;
            // A[i]를 A[0 ... i-1 ] 에 삽입할 인덱스를 찾는다
            while (j >= 0 && A[j] > insertElement) {
                A[j + 1] = A[j];
                j -= 1;
            }
            A[j + 1] = insertElement;
        }
    }

    public static void main(String[] args) {
        int[] intArray = {45, 89, 67, 92, 74, 26, 80};
        int i;
        // 정렬하기전 배열을 출력한다
        System.out.println("정렬 전 배열 : "+ Arrays.toString(intArray));

        // 선택 정렬을 사용하여 정렬하기 위해 삽입정렬 메소드를 호출한다
        insertionSort(intArray);

        // 정렬한 후 배열을 출력한다
        System.out.println("정렬 후 배열 : " + Arrays.toString(intArray));

    }
}
