import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== menu ===");
        System.out.println("0. exit");
        System.out.println("1. menu");
        System.out.println("2. deposit");
        System.out.println("3. withdrawal");
        System.out.println("4. show\n");
        System.out.print("메뉴선택 >  ");


        int a = 0;
        int b = 0;


        while(true) {

            int n = sc.nextInt();
            switch(n) {
                case 0:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("=== menu ===");
                    System.out.println("0. exit");
                    System.out.println("1. menu");
                    System.out.println("2. deposit");
                    System.out.println("3. withdrawal");
                    System.out.println("4. show\n");
                    System.out.print("메뉴 선택 >");
                    break;
                case 2:
                    System.out.print("입금 (원) > ");
                    b=sc.nextInt();
                    a+=b;
                    System.out.println();
                    System.out.print("메뉴 선택 > ");
                    break;
                case 3:
                    System.out.print("출금(원) > ");
                    b=sc.nextInt();
                    a=a-b;
                    System.out.println();
                    System.out.print("메뉴 선택 > ");
                    break;
                case 4:
                    System.out.print("잔액: "+a+"원\n");
                    System.out.print("메뉴 선택 > ");
                    break;
            }
        }

    }
}
