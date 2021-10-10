package Algorithm.Study;
// 재귀를 이용한 분할정복으로 최대 최소 탐색
public class Mid6_findMaxMin {
    // 분할 정복을 이용하여 배열 A[i...j]의 최솟값과 최댓값을 찾는다
    public static int[] findMaxMin(int[] A,int i,int j) {
        int mid;    // A[i...j]의 중앙 요소의 지수
        // A[i...j]의 최솟값과 최댓값을 저장하는 배열
        int[] result = new int[2];
        // A[i...mid]의 최솟값과 최댓값을 저장하는 배열
        int[] leftResult = new int[2];
        // A[mid+1...j]이 최솟값과 최댓값을 저장하는 배열
        int[] rightResult = new int[2];

        // 배열에[ 1개의 요소만 있는 경우
        if (i == j) {
            result[0] = A[i];
            result[1] = A[i];
        } else if (i == j - 1) { // 배열이 요소가 2개가 있는 경우
            if (A[i] < A[j]) {
                result[0] = A[i];
                result[1] = A[j];
            }else{
                result[0] = A[j];
                result[1] = A[i];
            }
        } else {
            // A[i...j]의 중앙요소의 지수를 계산한다
            mid = (i + j) / 2;

            // A[i...mid]의 최소값과 최댓값을 구한다
            leftResult = findMaxMin(A, i, mid);
            // A[mid+1...j]의 최소값과 최댓값을 구한다
            rightResult = findMaxMin(A, mid + 1, j);

            // A[i...j]의 최댓값과 최소값을 구한다
            if (leftResult[0] < rightResult[0]) {
                result[0] = leftResult[0];
            }else{
                result[0] = leftResult[1];
            }
            if (leftResult[1] < rightResult[1]) {
                result[1] = rightResult[1];
            }else{
                result[1] = rightResult[0];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] A = {24, 75, 92, 83, 61, 48, 97, 50};
        int[] answer = new int[2];

        // 배열 A의 최솟값과 최댓값을 찾는다
        answer = findMaxMin(A, 0, A.length - 1);

        // 배열 A의 최솟값과 최댓값을 출력한다.
        System.out.println("최솟값: " + answer[0]);
        System.out.println("최댓값: " + answer[1]);
    }
}
