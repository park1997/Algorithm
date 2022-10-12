package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        HashMap<Integer, List> dic = new HashMap<Integer, List>();
        while (true) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            if (a == 0 && b == 0) {
                break;
            }
            if (dic.get(a) == null) {
                dic.put(a, new ArrayList());
                dic.get(a).add(b);
            } else {
                dic.get(a).add(b);
            }
            System.out.println(dic);
        }


    }
}
