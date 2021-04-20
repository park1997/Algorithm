import java.util.Scanner;
public class ex02 {

    static int pi2(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            boolean a = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a == true) {
                cnt += 1;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        

    }
}