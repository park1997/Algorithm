package HW2;

import java.util.Scanner;

public class Hw2 {
    public static void hanoi(int n, int from, int to, int assist) {
        if (n == 1) {
            System.out.println(from+" "+to);
            return;
        }
        hanoi(n - 1,from,assist,to);
        System.out.println(from+" "+to);
        hanoi(n - 1, assist, to, from);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        hanoi(32, 1, 2, 3);
        String bi = Integer.toBinaryString(n);
        int result = 0;
        for (int i = bi.length()-1; i >= 0; i--) {
            if (bi.charAt(i) == '0') {
                result += 1;
            }else{
                result += 1;
                break;
            }
        }
        System.out.println(result);


    }
}
