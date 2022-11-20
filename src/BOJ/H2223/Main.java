package BOJ.H2223;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    private final static int INIT					= 100;
    private final static int NEW_CIVILIZATION		= 200;
    private final static int REMOVE_CIVILIZATION	= 300;
    private final static int GET_CIVILIZATION		= 400;
    private final static int GET_CIVILIZATION_AREA	= 500;
    private final static int MERGE_CIVILIZATION		= 600;

    private final static UserSolution usersolution = new UserSolution();

    private static boolean run(BufferedReader br) throws Exception
    {
        int Q, N, r, c, cmd;
        int mID, mID1, mID2;

        int ans, ret = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Q = Integer.parseInt(st.nextToken());

        boolean okay = false;

        for (int i = 0; i <= Q; ++i)
        {
            st = new StringTokenizer(br.readLine(), " ");

            cmd = Integer.parseInt(st.nextToken());
            switch(cmd)
            {
                case INIT:
                    N = Integer.parseInt(st.nextToken());
                    usersolution.init(N);
                    okay = true;
                    break;
                case NEW_CIVILIZATION:
                    r   = Integer.parseInt(st.nextToken());
                    c   = Integer.parseInt(st.nextToken());
                    mID = Integer.parseInt(st.nextToken());
                    if (okay)
                        ret = usersolution.newCivilization(r, c, mID);
                    ans = Integer.parseInt(st.nextToken());
                    if (ans != ret)
                        okay = false;
                    break;
                case REMOVE_CIVILIZATION:
                    mID = Integer.parseInt(st.nextToken());
                    if (okay)
                        ret = usersolution.removeCivilization(mID);
                    ans = Integer.parseInt(st.nextToken());
                    if (ans != ret)
                        okay = false;
                    break;
                case GET_CIVILIZATION:
                    r = Integer.parseInt(st.nextToken());
                    c = Integer.parseInt(st.nextToken());
                    if (okay)
                        ret = usersolution.getCivilization(r, c);
                    ans = Integer.parseInt(st.nextToken());
                    if (ans != ret)
                        okay = false;
                    break;
                case GET_CIVILIZATION_AREA:
                    mID = Integer.parseInt(st.nextToken());
                    if (okay)
                        ret = usersolution.getCivilizationArea(mID);
                    ans = Integer.parseInt(st.nextToken());
                    if (ans != ret)
                        okay = false;
                    break;
                case MERGE_CIVILIZATION:
                    mID1 = Integer.parseInt(st.nextToken());
                    mID2 = Integer.parseInt(st.nextToken());
                    if (okay)
                        ret = usersolution.mergeCivilization(mID1, mID2);
                    ans = Integer.parseInt(st.nextToken());
                    if (ans != ret)
                        okay = false;
                    break;
                default:
                    okay = false;
            }
        }

        return okay;
    }

    public static void main(String[] args) throws Exception
    {
        int TC, MARK;

        System.setIn(new java.io.FileInputStream("/Users/byeonghyeon/Documents/GitHub/Algorithm/src/BOJ/H2223/sample_input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        TC = Integer.parseInt(st.nextToken());
        MARK = Integer.parseInt(st.nextToken());

        for (int testcase = 1; testcase <= TC; ++testcase)
        {
            int score = run(br) ? MARK : 0;

            System.out.println("#" + testcase + " " + score);
//            break;
        }

        br.close();
    }
}
