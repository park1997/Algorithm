package BOJ;

import javax.management.InstanceNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node2 implements Comparable<Node2>{
    int dis;
    int b;

    public Node2(int dis, int b) {
        this.dis = dis;
        this.b = b;
    }

    public int compareTo(Node2 n) {
        return this.dis - n.dis;
    }
}


public class Main2 {
    static int[] distance;
    static ArrayList<Node2>[] graph;
    static int[] djikstra(int start) {
        PriorityQueue<Node2> q = new PriorityQueue<Node2>();
        q.add(new Node2(0, start));
        distance[start] = 0;
        while (!q.isEmpty()) {
            Node2 cur = q.poll();
            int cur_dis = cur.dis;
            int cur_node = cur.b;
            if (distance[cur_node] < cur_dis) {
                continue;
            }
            for (Node2 temp_node : graph[cur.b]) {
                int now_dis = temp_node.dis;
                int now_node = temp_node.b;
                int new_dis = now_dis + cur_dis;
                if (distance[now_node] > new_dis) {
                    distance[now_node] = new_dis;
                    q.add(new Node2(new_dis, now_node));
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(br.readLine());

        graph = new ArrayList[V + 1];
        for (int i = 0; i < V + 1; i++) {
            graph[i] = new ArrayList<Node2>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node2(w, v));
        }

        distance = new int[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        int[] dis = djikstra(K);

        for (int i = 1; i < distance.length; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }
}
