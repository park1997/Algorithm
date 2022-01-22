package Algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int result = 0;
    public static int length =102; // 최대 100x100 이지만 정사각형 최외각을 하나 더 만들어줌
    public static int graph[][] = new int[length][length];

    public static void bfs(int x, int y) {

        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{x, y});
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        while (!q.isEmpty()) {
            int r[] = q.poll();
            int a = r[0];
            int b = r[1];
            for (int i = 0; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];
                if (nx >= 0 && ny >= 0 && nx < length && ny < length) {
                    if (graph[nx][ny] == 0) {
                        graph[nx][ny] = 1;
                        q.add(new int[]{nx, ny});
                    } else if (graph[nx][ny] == 2) {
                        result += 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a + 1][b + 1] = 2;    // X를 2로 두었고 대각선 아래방향으로 이동시켜 저장함
        }
        bfs(0, 0); // 정사각형에 최외각을 하나 더 만들어줬으로 (0,0)은 절대 건초더미 내부의 점이 아니므로 (0,0)부터 탐색함
        System.out.println(result);
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }


    }
}
