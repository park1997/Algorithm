package midterm_융프;
//1번
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = "박병현";
        if (a >= 3 && b >= 5 && b <= 20) {
            System.out.println(c);
        }else{
            for (int i = c.length()-1; i >= 0; i--) {
                System.out.print(c.charAt(i));
            }
        }
    }
}
