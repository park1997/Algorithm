package BOJ.H2253;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static final UserSolution userSolution = new UserSolution();

    private final static int CMD_INIT = 100;
    private final static int CMD_SELECT_SEAT = 200;

    private static boolean run() throws IOException
    {
        int queryCnt = Integer.parseInt(br.readLine());
        boolean okay = false;
        int res, ans;

        for (int i = 0; i < queryCnt; i++)
        {
            StringTokenizer stdin = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(stdin.nextToken()))
            {
                case CMD_INIT:
                    int W = Integer.parseInt(stdin.nextToken());
                    int H = Integer.parseInt(stdin.nextToken());
                    userSolution.init(W, H);
                    okay = true;
                    break;
                case CMD_SELECT_SEAT:
                    res = userSolution.selectSeat(Integer.parseInt(stdin.nextToken()));
                    ans = Integer.parseInt(stdin.nextToken());
                    if (ans != res)
                    {
                        okay = false;
                    }
                    break;
            }
        }

        return okay;
    }

    public static void main(String[] args) throws IOException {
         System.setIn(new FileInputStream("/Users/byeonghyeon/Documents/GitHub/Algorithm/src/BOJ/H2253/sample_input.txt"));
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stinit = new StringTokenizer(br.readLine(), " ");

        int T, MARK;
        T = Integer.parseInt(stinit.nextToken());
        MARK = Integer.parseInt(stinit.nextToken());

        for (int tc = 1; tc <= T; tc++)
        {
            int score = run() ? MARK : 0;
            System.out.printf("#%d %d\n", tc, score);
            break;
        }

        br.close();
    }
}
