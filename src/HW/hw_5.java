package HW;

import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] stack = new char[a.length()];
        int head = -1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(' || a.charAt(i) == '{' || a.charAt(i) == '[') {
                stack[++head]=a.charAt(i);
            } else if (a.charAt(i) == ')' || a.charAt(i) == '}' || a.charAt(i) == ']') {
                if (a.charAt(i)==')' && stack[head]=='('){
                    head -= 1;
                } else if (a.charAt(i) == '}' && stack[head] == '{') {
                    head -= 1;
                } else if (a.charAt(i) == ']' && stack[head] == '[') {
                    head -= 1;
                }
            }
        }
        System.out.println(head==-1?"OK":"ERROR");
    }
}
