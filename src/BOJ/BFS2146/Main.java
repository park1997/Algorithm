package BOJ.BFS2146;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] graph;
    static int N;
    static boolean visited[][];
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {-1, 1, 0, 0};
    static int cnt = 0;
    static ArrayList<int[]> points = new ArrayList<>();

    static class Edge {
        int x;
        int y;

        public Edge(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    static void makeCluster() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    cnt += 1;
                    ArrayDeque<Edge> q = new ArrayDeque<Edge>();
                    q.offer(new Edge(i, j));
                    visited[i][j] = true;
                    graph[i][j] = cnt;
                    while (!q.isEmpty()) {
                        Edge cur = q.poll();
                        for (int d = 0; d < 4; d++) {
                            int nx = cur.x + dx[d];
                            int ny = cur.y + dy[d];
                            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {
                                if (graph[nx][ny] == 1) {
                                    visited[nx][ny] = true;
                                    q.add(new Edge(nx, ny));
                                    graph[nx][ny] = cnt;
                                } else if (graph[nx][ny] == 0) {
                                    points.add(new int[]{cur.x, cur.y});
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    static int findRoute() {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < points.size(); i++) {
            for (int j = i; j < points.size(); j++) {
                if (i == j) {
                    continue;
                }
                int px1 = points.get(i)[0];
                int py1 = points.get(i)[1];
                int px2 = points.get(j)[0];
                int py2 = points.get(j)[1];
                if (graph[px1][py1] == graph[px2][py2]) {
                    continue;
                }
                result = Math.min(result, Math.abs(px1 - px2) + Math.abs(py1 - py2));
            }
        }
        return result - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int temp[] = new int[N];
            for (int j = 0; j < N; j++) {
                int a = Integer.parseInt(st.nextToken());
                temp[j] = a;
            }
            graph[i] = temp;
        }

        makeCluster();
        int result = findRoute();
        System.out.println(result);
    }
}
