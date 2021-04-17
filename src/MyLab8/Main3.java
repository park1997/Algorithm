package MyLab8;

import java.util.Scanner;

// 괄호쌍 검사하기
// 교수님 풀이
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] stack = new char[str.length()];
        int top = -1;
        for(int i =0 ; i<str.length();i++){
            char c = str.charAt(i);
            if ((c == '(') || (c == '{') || (c == '[')) {
                top += 1;
                stack[top]=c;
            }else if (top == -1) {
                top = 0;
                System.out.println("123");
                break;
            }else{
                char v = stack[top];
                if(c==')' && v!='(') break;
                if(c=='}' && v!='{') break;
                if(c==']' && v!='[') break;
                top -= 1;
            }
        }
        // top ==-1 이면 yes 아니면 no
        System.out.println(top==-1?"YES":"NO");

    }
}

