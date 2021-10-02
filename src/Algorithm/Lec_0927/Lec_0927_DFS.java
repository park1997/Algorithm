package Algorithm.Lec_0927;
// Node class 코드는  134페이지에 있음
public class Lec_0927_DFS {
    public static void dfs(Node v) {


        for (int i = 0; i < neighbours.size(); i++) {
            Node w = neighbours.get(i)
        }

    }
    public static void main(String[] args) {
        // 주어진 무방향 그래프를 연결 목록으로 표현한다.

        // 정점들을 표현한다
        Node[] node = new Node[6];

        for (int i = 0; i < 6; i++) {
            node[i] = new Node(i + 1);
        }

        node[0].addNeighbours(node[1]);
        node[0].addNeighbours(node[2]);
        node[0].addNeighbours(node[4]);
        node[1].addNeighbours(node[0]);
        node[1].addNeighbours(node[2]);
        node[2].addNeighbours(node[0]);
        node[2].addNeighbours(node[1]);
        node[2].addNeighbours(node[3]);
        node[2].addNeighbours(node[4]);
        node[2].addNeighbours(node[5]);
        node[3].addNeighbours(node[2]);
        node[3].addNeighbours(node[5]);
        node[4].addNeighbours(node[0]);
        node[4].addNeighbours(node[2]);
        node[5].addNeighbours(node[2]);
        node[5].addNeighbours(node[3]);
    }
}
