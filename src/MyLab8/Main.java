package MyLab8;

import java.util.Scanner;
// charAT
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Input String : "+str);
        System.out.println("String length : "+str.length());
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            System.out.println("Character : "+c);
        }


        int r=Integer.parseInt(sc.next());
        System.out.println(r);
    }
}
