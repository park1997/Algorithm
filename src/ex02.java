import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        char[] a = new char[100];
        int top = -1;

        for (int i = 0; i < b.length(); i++) {
            a[++top]= b.charAt(i);
        }
        while (true) {
            if (top == -1) {
                break;
            }
            System.out.println(a[top--]);

        }


    }
}
