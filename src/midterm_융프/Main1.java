package midterm_융프;
//3번
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3-1
        int num = sc.nextInt();
        int[] arr = new int[num*2+1];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //3-2
        for (int i = 0; i < num; i++) {
            arr[i + num] = arr[num - i-1];
        }

        for (int i = 0; i <= num; i++) {
            arr[i] = arr[i + num];
        }
        for (int i =0; i <num ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp;
        int a = arr[num-1];
        int b = arr[num - 2];

        temp = a;
        a=b;
        b = temp;

        arr[num - 1] = a;
        arr[num - 2] = b;

        for (int i =0; i <num ; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
