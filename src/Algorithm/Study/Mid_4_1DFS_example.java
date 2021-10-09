package Algorithm.Study;

import java.util.Scanner;

public class Mid_4_1DFS_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N,M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
    }
}
