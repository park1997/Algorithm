package MyLab9;

import java.util.Scanner;

public class Main_answer {
    //교수님 풀이
    static int postCalc(String expr) {
        int[] stack = new int[100];
        int top = -1;
        for (int i = 0;i<expr.length();i++) {
            char c = expr.charAt(i);
            if (c >= '0' && c <= '9') {
                top += 1;
                stack[top] = c - '0';
            }else{
                int b = stack[top--];
                int a = stack[top--];
                int r = -1;
                if (c == '+') {
                    r= a + b;
                } else if (c == '-') {
                    r = a - b;
                } else if (c == '*') {
                    r = a * b;
                } else if (c == '/') {
                    r = a / b;
                }
                stack[++top] = r;
            }
        }
        return top == 0 ? stack[0] : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.next();
        System.out.println(expr + "="+postCalc(expr));
    }
}
