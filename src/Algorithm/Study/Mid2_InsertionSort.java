package Algorithm.Study;
// 최약의 경우 : 내림차순으로 정렬 되어있는 경우
public class Mid2_InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {45, 89, 67, 92, 53, 74, 26, 80};
        int i;

        // 정렬하기 전 배열을 출력한다
        System.out.print("정렬 전 배열 : ");

        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        // 선택정렬을 사용하여 정렬하기 위해 insertionSrot 메소드를 호출한다
        insertionSort(intArray);

        //정렬할 후 배열을 출력한다
        System.out.print("\n정렬 후 배열 : ");
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

    }
    public static void insertionSort(int[] A) {
        int i, j, insertElement;
        int n = A.length;

        for (i = 1; i < n; i++) {
            // A[0 ... i]를 재배열하여 정렬한다
            insertElement = A[i];   // A[i] 저장한다
            j = i - 1;
            while (j >= 0 && A[j] > insertElement) {
                A[j + 1] = A[j];
                A[j] = insertElement;
                j -= 1;
            }
        }
    }
}
