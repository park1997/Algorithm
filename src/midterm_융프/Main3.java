package midterm_융프;

import java.util.Scanner;

//2번
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== menu ===");
        System.out.println("1. ASCII코드 범위 입력");
        System.out.println("2. ASCII코드 출력");
        System.out.println("3. 메뉴");
        System.out.println("4. 종료");

        int a = 0, b = 0;

        while (true) {
            System.out.print(">");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("시작(32번 이상) 및 끝 번호 입력>");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    break;
                case 2:
                    int cnt = 0;
                    for (int i = a; i <= b; i++) {
                        cnt += 1;
                        System.out.print((char)i);
                        if (cnt % 12 == 0) {
                            System.out.println();
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("=== menu ===");
                    System.out.println("1. ASCII코드 범위 입력");
                    System.out.println("2. ASCII코드 출력");
                    System.out.println("3. 메뉴");
                    System.out.println("4. 종료");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }


    }
}
