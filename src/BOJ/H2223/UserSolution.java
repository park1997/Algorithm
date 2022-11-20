package BOJ.H2223;

import java.util.ArrayList;
import java.util.HashMap;

class UserSolution {
    static int[][] graph;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int n;
    static HashMap<Integer, ArrayList<Civil>> civil_map;

    static class Civil {
        int x;
        int y;
        public Civil(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void civilMapUpdate(int mID, int r, int c) {
        if (civil_map.get(mID) == null) {
            ArrayList<Civil> temp = new ArrayList<>();
            temp.add(new Civil(r - 1, c - 1));
            civil_map.put(mID, temp);
        } else {
            ArrayList<Civil> temp = civil_map.get(mID);
            temp.add(new Civil(r - 1, c - 1));
            civil_map.put(mID, temp);
        }
    }

    void init(int N) {
        graph = new int[N][N];
        n = N;
        civil_map = new HashMap<Integer, ArrayList<Civil>>();

    }

    int newCivilization(int r, int c, int mID) {
        int max_cnt = -1;
        HashMap<Integer, Integer> cnt_map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            int nx = r - 1 + dx[i];
            int ny = c - 1 + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && graph[nx][ny] != 0) {
                if (cnt_map.get(graph[nx][ny]) == null) {
                    cnt_map.put(graph[nx][ny], 1);
                } else {
                    cnt_map.put(graph[nx][ny], cnt_map.get(graph[nx][ny]) + 1);
                }
                if (cnt_map.get(graph[nx][ny]) > max_cnt) {
                    max_cnt = cnt_map.get(graph[nx][ny]);
                }
            }
        }
        if (max_cnt == -1) {
            graph[r - 1][c - 1] = mID;
            civilMapUpdate(mID, r, c);
            return mID;
        }
        int min_id = Integer.MAX_VALUE;
        for (int t : cnt_map.keySet()) {
            if (cnt_map.get(t) == max_cnt && t < min_id) {
                min_id = t;
            }
        }
        graph[r - 1][c - 1] = min_id;
        civilMapUpdate(min_id, r, c);
        return min_id;
    }

    int removeCivilization(int mID) {
        ArrayList<Civil> temp = civil_map.get(mID);
        if (temp == null) {
            return 0;
        }
        civil_map.remove(mID);
        for (Civil c : temp) {
            graph[c.x][c.y] = 0;
        }
        return temp.size();
    }

    int getCivilization(int r, int c) {
        return graph[r - 1][c - 1];
    }

    int getCivilizationArea(int mID) {
        if (civil_map.get(mID) == null) {
            return 0;
        } else {
            return civil_map.get(mID).size();
        }
    }

    int mergeCivilization(int mID1, int mID2) {
        if (civil_map.get(mID1).size() >= civil_map.get(mID2).size()) {
            ArrayList<Civil> temp1 = civil_map.get(mID1);
            for (Civil t : civil_map.get(mID2)) {
                temp1.add(t);
                graph[t.x][t.y] = mID1;
            }
            civil_map.put(mID1, temp1);
            civil_map.remove(mID2);
        } else {
            ArrayList<Civil> temp2 = civil_map.get(mID2);
            for (Civil t : civil_map.get(mID2)) {
                graph[t.x][t.y] = mID1;
            }
            for (Civil t : civil_map.get(mID1)) {
                temp2.add(t);
            }
            civil_map.put(mID1, temp2);
            civil_map.remove(mID2);
        }
        return civil_map.get(mID1).size();
    }
}
