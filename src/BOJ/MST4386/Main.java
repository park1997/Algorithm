package BOJ.MST4386;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Node>[] graph;
    static int n;
    static class Node implements Comparable<Node>{
        double dis;
        int node;

        public Node(double dis, int node) {
            this.dis = dis;
            this.node = node;
        }

        @Override
        public int compareTo(Node o) {
            return Double.compare(this.dis, o.dis);
        }
    }

    static double prim() {
        double result = 0;
        PriorityQueue<Node> q = new PriorityQueue<Node>();
        boolean[] visited = new boolean[n];
        q.offer(new Node(0, 0));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (visited[cur.node]) {
                continue;
            }
            result += cur.dis;
            visited[cur.node] = true;
            for (Node now : graph[cur.node]) {
                if (!visited[now.node]) {
                    q.offer(new Node(now.dis, now.node));
                }
            }
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n];
        ArrayList<Double>[] point = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            point[i] = new ArrayList(Arrays.asList(x,y));
            graph[i] = new ArrayList<Node>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    continue;
                }
                ArrayList<Double> start = point[i];
                ArrayList<Double> end = point[j];
                double x1 = start.get(0);
                double x2 = end.get(0);
                double y1 = start.get(1);
                double y2 = end.get(1);
                double dis = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
                graph[i].add(new Node(dis, j));
                graph[j].add(new Node(dis, i));
            }
        }

        double result = prim();
        System.out.println(String.format("%.2f", result));
    }
}
