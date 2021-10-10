package Algorithm.Study;

import java.util.List;
import java.util.Stack;

public class Mid5_TopologicalSort {
    Stack<Node> stack;

    // 비어있는 스택을 생성한다
    public Mid5_TopologicalSort() {
        stack = new Stack<>();
    }

    // 위상정렬을 v에서 시작한다
    public void topologicalSort(Node v) {
        // 정점 v에 인접한 정점들의 연결 목록을 끄집어 낸다
        List<Node> neighbours = v.getNeighbours();

        // v에 인접한 모든 정점에 대해 깊이 우선 탐색을 한다
        for (int i = 0; i < neighbours.size(); i++) {
            Node w = neighbours.get(i);

            if (w != null && !w.visited) {
                w.visited = true;
                topologicalSort(w);
            }
        }
        // v를 스택에 밀어 넣는다
        stack.push(v);
    }

    public static void main(String[] args) {
        Mid5_TopologicalSort topological = new Mid5_TopologicalSort();

        // 주어진 방향 그래프를 연결 목록으로 표현한다

        // 그래프에 깊이 우선 탐색을 시작하는 정점 0을 추가한다
        Node node0 = new Node(0);

        // 그래프에 있는 정점들을 생성한다
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        // 간선들을 추가한다

        // 정점 0에서 진입간선이 없는 정점 1로 가는 간선을 추가한다
        node0.addNeighbours(node1);
        // 정점 0에서 진입간선이 없는 정점 3으로 가는 간선을 추가한다
        node0.addNeighbours(node3);
        // 그래프에 간선을 나타낸다
        node1.addNeighbours(node2);
        node1.addNeighbours(node4);
        node2.addNeighbours(node4);
        node2.addNeighbours(node6);
        node3.addNeighbours(node4);
        node3.addNeighbours(node5);
        node4.addNeighbours(node6);
        node5.addNeighbours(node6);
        node5.addNeighbours(node7);
        node6.addNeighbours(node7);

        System.out.println("위상정렬 순서:");

        // 시작 정점 node0을 '방문함'으로 표시한다
        node0.visited = true;

        // node0에서 위상 정렬을 시작한다
        topological.topologicalSort(node0);

        // 스택을 가져온다
        Stack<Node> resultStack = topological.stack;

        // 스태에 있는 노드들을 출력한다
        while (resultStack.empty() == false) {
            System.out.print(resultStack.pop()+" ");
        }
    }
}
