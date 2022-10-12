package BOJ.MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int V, E;
    static ArrayList<Node>[] graph;
    static class Node implements Comparable<Node>{
        int dis, node_num;

        public Node(int dis, int node_num) {
            this.dis = dis;
            this.node_num = node_num;
        }

        @Override
        public int compareTo(Node n) {
            return this.dis - n.dis;
        }
    }

    static int mst(int start) {
        boolean[] visited = new boolean[V + 1];
        PriorityQueue<Node> q = new PriorityQueue<Node>();
        q.offer(new Node(0, start));
        int cnt = 0;
        int result = 0;
        while (!q.isEmpty()) {
            Node cur = q.poll();
            int cur_dis = cur.dis;
            int cur_node = cur.node_num;
            // 그 노드가 이미 방문했다면 넘기기
            if (visited[cur_node]) {
                continue;
            }
            cnt += 1;
            result += cur_dis;
            visited[cur_node] = true;
            for (int i = 0; i < graph[cur_node].size(); i++) {
                Node now = graph[cur_node].get(i);
                int now_dis = now.dis;
                int now_node = now.node_num;
                if (!visited[now_node]) {
                    q.offer(new Node(now_dis, now_node));
                }
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        // graph 배열 크키 생성 -> 모양 맞추기
        graph = new ArrayList[V + 1];
        for (int i = 0; i < V + 1; i++) {
            graph[i] = new ArrayList<Node>();
        }
        // 연결관계 만들기
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            graph[A].add(new Node(C, B));
            graph[B].add(new Node(C, A));
        }

        int result = mst(1);
        System.out.println(result);

    }
}
