package HW;

import java.util.Scanner;

public class hw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letters = sc.nextLine().split(" ");
        int head = -1;
        int[] stack = new int[1000];
        for (int i=0;i< letters.length;i++) {
            if (letters[i].equals("+") || letters[i].equals("-") || letters[i].equals("*") || letters[i].equals("/")) {
                if (letters[i].equals("+")) {
                    stack[head - 1] = stack[head - 1] + stack[head];
                    head -= 1;
                } else if (letters[i].equals("-")) {
                    stack[head - 1] = stack[head - 1] - stack[head];
                    head -= 1;
                } else if (letters[i].equals("*")) {
                    stack[head - 1] = stack[head - 1] * stack[head];
                    head -= 1;
                } else if (letters[i].equals("/")) {
                    stack[head - 1] = stack[head - 1] / stack[head];
                    head -= 1;
                }
            }else if (letters[i].equals("=")){
                break;
            }else{
                stack[++head] = Integer.parseInt(letters[i]);
            }
        }
        System.out.println(stack[head]);
    }
}
