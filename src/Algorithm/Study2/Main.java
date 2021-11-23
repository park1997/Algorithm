package Algorithm.Study2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("회의 신청 개수 : ");
        int N = sc.nextInt();
        int room[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            System.out.print("회의 "+(i+1)+" 시작 시간: ");
            room[i][0] = sc.nextInt();
            System.out.print("회의 "+(i+1)+" 시작 시간: ");
            room[i][1] = sc.nextInt();
        }
        int temp_room[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            temp_room[i][0] = room[i][0];
            temp_room[i][1] = room[i][1];
        }
        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int result = 0;
        int s = room[0][0];
        int e = room[0][1];
        int result_room[][] = new int[10][2];
        result_room[0][0] = s;
        result_room[0][1] = e;
        for (int i = 1; i < N; i++) {
            if (room[i][0] >= e) {
                result += 1;
                s = room[i][0];
                e = room[i][1];
                result_room[result][0] = s;
                result_room[result][1] = e;
            }
        }

        System.out.println("배정 가능 회의 개수 : " + (result+1));

        for (int i = 0; i <= result; i++) {
            for (int j = 0; j < N; j++) {
                if ((result_room[i][0] == temp_room[j][0]) && (result_room[i][1] == temp_room[j][1])) {
                    System.out.print(j+1);
                    break;
                }
            }
            if (i != result) {
                System.out.print("->");
            }
        }
        System.out.println();

        for (int i = 0; i <= result; i++) {
            System.out.print(result_room[i][0] + "~" + result_room[i][1]+"시");
            if (i != result) {
                System.out.print("->");
            }
        }



    }
}
