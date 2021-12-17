package Algorithm.FinalTerm;

public class Main1 {
    static int N = 5;   // 노드의 개수
    static int m = 3;   // R,G,B색의 수 3개
    static int[] vcolor;

    public static boolean valid(int[][] graph, int i) {
        int j = 1;
        while (j < i) {
            if (graph[i - 1][j - 1] == 1 && vcolor[i] == vcolor[j]) {
                return false;
            } else {
                j += 1;
            }
        }
        return true;
    }

    public static void m_coloring(int graph[][], char[] Node, int i) {
        int color;
        if (valid(graph, i)) {
            if (i == N) {
                for (i = 1; i <= N; i++) {
                    if (vcolor[i] == 1) {
                        System.out.print("정점 " + Node[i] + "의 색 : 'Red' ");
                    } else if (vcolor[i] == 2) {
                        System.out.print("정점 " + Node[i] + "의 색 : 'Green' ");
                    } else if (vcolor[i] == 3) {
                        System.out.print("정점 " + Node[i] + "의 색 : 'Blue' ");
                    }
                }
                System.out.println();
            } else {
                for (color = 1; color <= m; color++) {
                    vcolor[i + 1] = color;
                    m_coloring(graph, Node, i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        vcolor = new int[10];
        // 시작을 위해 임의의 노드 S 생성
        char[] Node = {'S', 'A', 'B', 'C', 'D', 'E'};
        // 노드들끼리 연결되어있으면 1 , 아니면 0
        int graph[][] = {{0, 1, 1, 1, 0}, {1, 0, 1, 0, 1}, {1, 1, 0, 1, 1}, {1, 0, 1, 0, 1}, {0, 1, 1, 1, 0}};
        System.out.println("지도를 색칠하는 방법");
        m_coloring(graph, Node, 0);
    }
}
