package Algorithm.Study;

public class Mid3_HeapSort {
    public static int findLarger(int[] A, int x, int eh) {
        int y = 0;

        if (2 * x + 1 <= eh) {
            // 자식 노드가 둘다 있는 경우
            if (A[2 * x] > A[x] || A[2 * x + 1] > A[x]) {
                //A[x] 보다 더 큰 값을 가지는 자식 노드의 지수를 구한다
                if (A[2 * x] >= A[2 * x + 1]) {
                    y = 2 * x;
                } else {
                    y = 2 * x + 1;
                }
            }
        }else {    // 자식노드가 하나만 있는 경우
            if (2 * x <= eh && A[2 * x] > A[x]) {
                y = 2 * x;
            }
        }
        return y;
    }

    // A[x]를 힙 조건이 만족될 때까지 트리의 아래 층으로 내려 보낸다
    public static void pushDown(int[] A, int x, int bh, int eh) {
        int y, temp;
        y = findLarger(A, x, eh);
        while (A[x] < A[y]) {
            temp = A[x];
            A[x] = A[y];
            A[y] = temp;

            x = y;
            y = findLarger(A, x, eh);
        }
    }
    public static void buildHeap(int[] A, int eh) {
        // bh : heap내에 첫번째 잎의 지수
        int bh, x;
        bh = (A.length - 1) / 2 + 1;

        while (bh > 1) {
            bh -= 1;
            x = bh;

            // x 에서 힙조건이 만족될 때까지 A[x]를 트리의 아래층으로
            // 내려보낸다
            pushDown(A, 1, eh / 2, eh);

        }

    }
    public static void heapSort(int[] A) {
        // eh : heap내에 마지막 잎의 지수
        int eh, temp;
        eh = A.length - 1;

        // 주어진 배열을 힙으로 만든다
        buildHeap(A, eh);

        // 힙에서 최댓값을 제거하고 남은 트리를 다시 힙으로 만든다
        while (eh > 1) {
            // A[1]과 A[eh] 를 교환한다
            temp = A[1];
            A[1] = A[eh];
            A[eh] = temp;

            // 힙에서 최댓값을 제거한다
            eh -= 1;

            // 남은 트리를 다시 힙으로 만든다
            pushDown(A, 1, eh / 2, eh);
        }

    }
    public static void main(String[] args) {
        int intArray[] = {0, 1, 2, 6, 4, 8, 7};
        int i;

        System.out.print("정렬 전 배열 : ");
        for (i = 1; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        // 힙 정렬을 사용하여 정렬하기 위해 heapSort 메소드를 호출한다
        heapSort(intArray);

        // 정렬한 후 배열을 출력한다.
        System.out.print("\n정렬 후 배열 : ");
        for (i = 1; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
