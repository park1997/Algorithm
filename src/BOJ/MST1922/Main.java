package BOJ.MST1922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Node>[] graph;
    static StringTokenizer st;
    static int N, M;

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
            for (int i = 0; i < graph[cur.node].size(); i++) {
                Node now = graph[cur.node].get(i);
                if (!visited[now.node]) {
                    q.offer(new Node(now.dis, now.node));
                }
            }
        }

        return result;
    }

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


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<Node>();
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[a].add(new Node(c, b));
            graph[b].add(new Node(c, a));
        }


        int result = prim(1);
        System.out.println(result);

    }
}
