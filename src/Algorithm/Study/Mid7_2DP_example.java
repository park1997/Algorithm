package Algorithm.Study;

import java.util.*;

/*
1로 만들기

정수 X가 주어졌을 떼, 정수 X에 사용할 수 있는 연산은 다음과 같이 4가지 입니다.
1. X가 5로 나누어 떨어지면 5로 나눕니다.
2. X가 3으로 나누어 떨어지면, 3으로 나눕니다
3. X가 2로 나누어 떨어지면 2로 나눕니다.
4. X에서 1을 뺍니다.
정수 X가 주어졌을 떄, 연산 4개를 적절히 사용해서 값을 1로 만들고자 합니다.
연산을 사용하는 횟수의 최솟값을 출력하세요. 예를들어 정수가 26이면 다음과 같이 계산해서 3번의
연산이 최솟값 입니다.
26 -> 25 -> 5 -> 1
 */
public class Mid7_2DP_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> dp = new ArrayList<Integer>();
        if (num == 1 || num == 2 || num == 3 || num == 5) {
            System.out.println(1);
        } else if (num == 4) {
            System.out.println(2);
        } else {
            dp.add(1);
            dp.add(1);
            dp.add(1);
            dp.add(2);
            dp.add(1);
            for (int i = 5; i < num; i++) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                if ((i + 1) % 2 == 0) {
                    temp.add(dp.get(i / 2) + 1);
                }
                if ((i + 1) % 3 == 0) {
                    temp.add(dp.get(i / 3) + 1);
                }
                if ((i + 1) % 5 == 0) {
                    temp.add(dp.get(i / 5) + 1);
                }
                temp.add(dp.get(i - 1) + 1);
                int min = Collections.min(temp);
                dp.add(min);
            }
        }
        System.out.println(dp.get(num - 1));
    }
}
