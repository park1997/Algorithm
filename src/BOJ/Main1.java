package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

class Node{
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}



public class Main1 {
    static int N;
    static int M;
    static int[][] visited;
    static int[][] graph;

    static int bfs(int x,int y) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        ArrayDeque<Node> q = new ArrayDeque<>();
        q.offer(new Node(x, y));
        visited[x][y] = 1;

        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.x == N - 1 && cur.y == M - 1) {
                return visited[cur.x][cur.y];
            }
            for (int d = 0; d < 4; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && visited[nx][ny] == 0 && graph[nx][ny] == 1) {
                    visited[nx][ny] = visited[cur.x][cur.y] + 1;
                    q.offer(new Node(nx, ny));

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < temp.length(); j++) {
                graph[i][j] = temp.charAt(j) - '0';
            }
        }
//        for (int i = 0; i < graph.length; i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }
        int result = bfs(0, 0);
        System.out.println(result);

    }
}
