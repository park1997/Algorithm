package BOJ.MST14621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Node>[] graph;
    static int N;
    static String[] univ;
    static boolean visited[];
    static class Node implements Comparable<Node>{
        int dis;
        int node;
        String sex;
        public Node(int dis, int node, String sex) {
            this.dis = dis;
            this.node = node;
            this.sex = sex;
        }
        @Override
        public int compareTo(Node o) {
            return this.dis - o.dis;
        }
    }

    static int prim(int start) {
        int ans = 0;

        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(0, start, univ[start - 1]));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (visited[cur.node]) {
                continue;
            }
            ans += cur.dis;
            visited[cur.node] = true;
            for (Node now : graph[cur.node]) {
                if (!visited[now.node] && !now.sex.equals(cur.sex)) {
                    q.add(new Node(now.dis, now.node, now.sex));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        univ = br.readLine().split(" ");
        graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<Node>();
        }
        visited = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(d, v, univ[v - 1]));
            graph[v].add(new Node(d, u, univ[u - 1]));
        }

        int result = prim(1);

        System.out.println(result);
    }
}
