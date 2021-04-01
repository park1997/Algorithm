package MyLab5;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i=0;i<=a;i++){
            b.add(i, 1);
        }
        b.set(0, 0);
        b.set(1,0);

        for (int i = 2; i<sqrt(a); i++){
            int cnt =1;
            while(true){
                cnt+=1;
                if (i * cnt >= b.size()) {
                    break;
                }else{
                    b.set(i * cnt, 0);
                }
            }
        }

        int result =0;
        for(int i : b){
            result += i;
        }
        System.out.println(result);
    }
}
