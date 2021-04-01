package HW;

import java.util.Scanner;

public class hw_3 {

    static long GCD(long a, long b){
        long temp=0,num=0;
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
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a= sc.nextLong();
        long b = sc.nextLong();
        long result = 0,temp=0,lcm=0;

        temp = n / a;
        result += a*(temp*(temp+1))/2;

        temp = n / b;
        result += b*(temp*(temp+1))/2;

        lcm = (a*b)/GCD(a, b);
        temp = n / lcm;
        result -= lcm * (temp * (temp + 1)) / 2;

        System.out.println(result);
    }
}
