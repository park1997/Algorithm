import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= sc.nextInt();
        }
        String a = String.valueOf(num);
        char b;

        for (int j = 0; j < 10; j++) {
            int cnt = 0;
            for (int i = 0; i < a.length(); i++) {
                int temp = a.charAt(i)-48;
                if (j == temp) {
                    cnt += 1;
                }
            }
            System.out.println(cnt);
        }
    }

}
