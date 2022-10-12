package BOJ.MST1647;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static ArrayList<Node>[] graph;
    static int MAX_DIS = -1;
    static class Node implements Comparable<Node>{
        int dis, node;

        public Node(int dis, int node) {
            this.dis = dis;
            this.node = node;
        }
        @Override
        public int compareTo(Node o) {
            return this.dis - o.dis;
        }
    }
    static int prim(int start) {
        int result = 0;
        boolean[] visited = new boolean[N + 1];
        PriorityQueue<Node> q = new PriorityQueue<Node>();
        q.offer(new Node(0, start));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (visited[cur.node]) {
                continue;
            }
            result += cur.dis;
            visited[cur.node] = true;
            MAX_DIS = Math.max(MAX_DIS, cur.dis);
            for (Node now : graph[cur.node]) {
                if (!visited[now.node]) {
                    q.offer(new Node(now.dis, now.node));
                }
            }
        }
        return result - MAX_DIS;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<Node>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            graph[A].add(new Node(C, B));
            graph[B].add(new Node(C, A));
        }
        int result = prim(1);
        System.out.println(result);
    }
}
