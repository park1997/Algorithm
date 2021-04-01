package HW;
import java.util.Scanner;
public class hw_2 {
    public static void main(String[] args) {
        // 유클리드 호제법
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long temp=0, num=0;

        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        while(true){
            if (a%b!=0){
                num = a % b;
                a = b;
                b = num;
            }else{
                System.out.println(b);
                break;
            }
        }





    }

}
