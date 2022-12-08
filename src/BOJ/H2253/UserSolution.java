package BOJ.H2253;

import java.util.Arrays;

class UserSolution {
    static int[][] graph;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    static int w;
    static int h;
    public void init(int W, int H) {
        graph = new int[W][H];
        w = W;
        h = H;
    }

    public int selectSeat(int mSeatNum) {
        int x = mSeatNum / w;
        int y = mSeatNum - (x * w) - 1;
        int dis = 1;
        while (true) {
        
        }


        return 0;
    }

}
