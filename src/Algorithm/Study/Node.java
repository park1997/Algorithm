package Algorithm.Study;

import java.util.ArrayList;

public class Node {
    int info;
    boolean visited;
    ArrayList<Node> neighbours;

    // Node 객체를 생성한다
    public Node(int info) {
        this.info = info;
        this.visited = false;
        this.neighbours = new ArrayList<>();
    }

    // 정점에 인접한 정점들의 연결 목록에 새 정점을 추가한다.
    public void addNeighbours(Node neighboursNode) {
        this.neighbours.add(neighboursNode);
    }

    // 정점에 인접한 정점들의 연결 목록을 반환한다
    public ArrayList<Node> getNeighbours() {
        return neighbours;
    }

    // 정점에 인접한 정점들의 연결 목록을 주어진 연결목록으로 변경한다
    public void setNeighbours(ArrayList<Node> neighbours) {
        this.neighbours = neighbours;
    }

    // 정점에 대응된 데이터를 반환한다.
    public String toString() {
        return "" + info;
    }
}