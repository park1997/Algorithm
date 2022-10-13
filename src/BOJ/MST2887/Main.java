package BOJ.MST2887;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Node>[] graph;
    static boolean[] visited;
    static PriorityQueue<Node> q = new PriorityQueue<>();
    static class Node implements Comparable<Node>{
        double dis;
        int node;

        public Node(double dis, int node) {
            this.dis = dis;
            this.node = node;
        }

        @Override
        public int compareTo(Node o) {
            return Double.compare(this.dis , o.dis);
        }
    }
    static double prim() {
        double result = 0;
        q.add(new Node(0, 0));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (visited[cur.node]) {
                continue;
            }
            result += cur.dis;
            visited[cur.node] = true;
            for (Node now : graph[cur.node]) {
                if (!visited[now.node]) {
                    q.add(new Node(now.dis, now.node));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<Node>();
        }
        ArrayList<long[]> points = new ArrayList();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            long X = Long.parseLong(st.nextToken());
            long Y = Long.parseLong(st.nextToken());
            points.add(new long[]{X, Y});
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < N; j++) {
                if (i == j) {
                    continue;
                }
                long sx = points.get(i)[0];
                long sy = points.get(i)[1];
                long ex = points.get(j)[0];
                long ey = points.get(j)[1];
                double distance = Math.sqrt((sx - ex) * (sx - ex) + (sy - ey) * (sy - ey));
                graph[i].add(new Node(distance, j));
                graph[j].add(new Node(distance, i));
            }
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s - 1].add(new Node(0, e - 1));
            graph[e - 1].add(new Node(0, s - 1));
        }

        double ans = prim();
        String answer = String.format("%.2f", ans);
        System.out.println(answer);
    }
}
