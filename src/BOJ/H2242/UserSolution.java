package BOJ.H2242;

import java.util.PriorityQueue;

class UserSolution {
    static int[][] graph;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int r;
    static int c;

    static class Machine implements Comparable<Machine>{
        int crush;
        int x;
        int y;

        public Machine(int crush, int x, int y) {
            this.crush = crush;
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Machine o) {
            return this.crush - o.crush;
        }
    }

    public void init(int R, int C, int M, int mStructureR[], int mStructureC[]) {
        r = R;
        c = C;
        graph = new int[R][C];
        for (int i = 0; i < M; i++) {
            graph[mStructureR[i]][mStructureC[i]] = 1;
        }
    }

    public int minDamage(int mStartR, int mStartC, int mEndR, int mEndC) {
        PriorityQueue<Machine> q = new PriorityQueue<Machine>();
        int[][] visited = new int[r][c];

        q.add(new Machine(0, mStartR, mStartC));
        visited[mStartR][mStartC] = 1;

        while (!q.isEmpty()) {
            Machine m = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = m.x;
                int ny = m.y;
                if (nx == mEndR && ny == mEndC) {
                    return m.crush;
                }
                while (true) {
                    nx += dx[i];
                    ny += dy[i];
                    if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                        if (nx == mEndR && ny == mEndC) {
                            return m.crush;
                        }
                        if (graph[nx][ny] == 0) {
                            continue;
                        } else if (graph[nx][ny] == 1) {
                            if (visited[nx - dx[i]][ny - dy[i]] == 0) {
                                visited[nx - dx[i]][ny - dy[i]] = 1;
                                q.add(new Machine(m.crush + 1, nx - dx[i], ny - dy[i]));
                            } else {
                                break;
                            }
                            break;
                        }
                    } else {    // graph를 벗어난 경우
                        break;
                    }
                }
            }
        }
        return -1;
    }

}