package MyLab8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stack = new String[100];
        int top = -1;
        for (int i = 0; i < 10; i++) {
            // stack push
            top += 1;
            stack[top] = sc.next();
        }
        while(top>-1){
            // top : stack[top]
            System.out.println(stack[top]);
            // pop()
            top-=1;
        }


    }
}
