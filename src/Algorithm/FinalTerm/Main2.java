package Algorithm.FinalTerm;

import java.util.ArrayList;
import java.util.List;
public class Main2 {
    static int INF = Integer.MAX_VALUE;

    public static void DFS(Node v) {
        System.out.print(v.info + " ");
        v.visited = true;
        List<Node> neighbours = v.getNeighbours();

        for (int i = 0; i < neighbours.size(); i++) {
            Node w = neighbours.get(i);
            if (w != null && !w.visited)
                DFS(w);
        }
    }
    public static Node[] primMST(int[][] w, int n) {
        int[] near = new int[n];
        boolean[] isblue = new boolean[n];
        int b, minval;
        Node[] mst = new Node[n];

        for(int i = 0; i < n; i++)
            mst[i] = new Node(i);
        isblue[0] = false;
        int newred = 0;
        System.out.println("노드의 연결 상태와 간선에 대한 가중치");
        for(int i = 1; i < n; i++) {
            isblue[i] = true;
            near[i] = 0;
        }
        for(int i = 1; i <= n - 1; i++) {
            minval = INF;
            for(b = 0; b < n; b++) {
                if(isblue[b]) {
                    if(w[b][near[b]] < minval) {
                        minval = w[b][near[b]];
                        newred = b;
                    }
                }
            }
            isblue[newred] = false;
            System.out.println(near[newred] + " - " + newred + "\t " + w[newred][near[newred]]);
            mst[near[newred]].addNeighbours(mst[newred]);

            for(b = 0; b < n; b++) {
                if(isblue[b]) {
                    if(w[b][newred] < w[b][near[b]])
                        near[b] = newred;
                }
            }
        }
        return mst;
    }
    public static void main(String[] args) {
        int graph[][] = {{0, 10, 7, INF, INF, 15}, {10, 0, INF, 10, 7, INF}, {7, INF, 0, 7, 10, INF}, {INF, 10, 7, 0, INF, 5}, {INF, 7, 10, INF, 0, 12}, {15, INF, INF, 5, 12, 0}};
        Node node[];
        node = primMST(graph, 6);
        System.out.println("\n깊이 우선 탐색을 이용하여 얻은 해밀토니안 회로");
        DFS(node[0]);
        System.out.println(node[0].info);
    }
}
class Node{
    int info;
    boolean visited;
    ArrayList<Node> neighbors;

    public Node(int data) {
        this.info = data;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }
    public void addNeighbours(Node neighborsnode) {
        this.neighbors.add(neighborsnode);
    }
    public ArrayList<Node> getNeighbours(){
        return neighbors;
    }
}
