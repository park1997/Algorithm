
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       String[] nums = {"a","b","c","d"};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println();

        int cnt = 0;
        for(String i:nums){
            cnt += 1;
            System.out.println(cnt+" "+i);
        }




    }

}
