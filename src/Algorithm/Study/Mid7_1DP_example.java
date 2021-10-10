package Algorithm.Study;

import java.util.Scanner;

/*
동빈나 6. 다이나믹프로그래밍 강의
개미 전사는 부족한 식량을 충당하고자 메뚜기 마을의 식량창고를 몰래 공격하려고 합니다.
메뚜기 마을에는 여러 개의 식량창고가 있는데 식량창고는 일직선으로 이어져 있습니다.
각 식량창고엔는 정해진 수의 식량을 저장하고 있으며 개미 전사는 식량창고를 선택적으로 약탈하여
시량을 빼앗을 예정입니다. 이때 메뚜기 정찰병들은 일직선상에 존재하는 식량창고 중에서
서로 인접한 식량창고가 공격받으면 바로 알아챌 수 있습니다
따라서 개미 전사가 정찰병에게 들키지 않고 식량 창고를 약탈하기 위해서는 최소한 한칸 이상 떨어진
식량 창고를 약탈해야합니다

입력예시
4
1 3 1 5
답
8
 */
public class Mid7_1DP_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] food = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            food[i] = sc.nextInt();
        }

        dp[0] = food[0];
        dp[1] = food[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + food[i]);
        }
        System.out.println(dp[n - 1]);
    }
}
