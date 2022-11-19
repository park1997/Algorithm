package BOJ.H2242;

import java.io.IOException;
import java.util.Scanner;

class Solution {
    private static Scanner sc;
    private final static int CMD_INIT		= 1;
    private final static int CMD_MIN_DAMAGE	= 2;

    private final static UserSolution usersolution = new UserSolution();

    private static int[] mStructureR = new int[30000];
    private static int[] mStructureC = new int[30000];

    private static boolean run() throws IOException
    {
        int numQuery;
        int R, C, M, mStartR, mStartC, mEndR, mEndC;
        int userAns, ans;

        boolean isCorrect = false;

        numQuery =  sc.nextInt();

        for (int q = 0; q < numQuery; ++q)
        {
            int cmd;
            cmd = sc.nextInt();

            switch (cmd)
            {
                case CMD_INIT:
                    R = sc.nextInt();
                    C = sc.nextInt();
                    M = sc.nextInt();
                    for (int i = 0; i < M; i++)
                        mStructureR[i] = sc.nextInt();
                    for (int i = 0; i < M; i++)
                        mStructureC[i] = sc.nextInt();
                    usersolution.init(R, C, M, mStructureR, mStructureC);
                    isCorrect = true;
                    break;
                case CMD_MIN_DAMAGE:
                    mStartR = sc.nextInt();
                    mStartC = sc.nextInt();
                    mEndR = sc.nextInt();
                    mEndC = sc.nextInt();
                    userAns = usersolution.minDamage(mStartR, mStartC, mEndR, mEndC);
                    ans = sc.nextInt();
                    if (userAns != ans)
                    {
                        isCorrect = false;
//                        System.out.println("Min-Damage : " + userAns + " - > " + ans);

                    }
                    break;
                default:
                    isCorrect = false;
                    break;
            }
        }
        return isCorrect;
    }

    public static void main(String[] args) throws Exception
    {
        int TC, MARK;

        System.setIn(new java.io.FileInputStream("/Users/byeonghyeon/Documents/GitHub/Algorithm/src/BOJ/H2242/sample_input.txt"));

        sc = new Scanner(System.in);

        TC = sc.nextInt();
        MARK = sc.nextInt();

        for (int testcase = 1; testcase <= TC; ++testcase)
        {
            int score = run() ? MARK : 0;
            System.out.println("#" + testcase + " " + score);
//            break;
        }
    }
}