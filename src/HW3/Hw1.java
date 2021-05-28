package HW3;

import java.util.Hashtable;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable ht = new Hashtable();
        String str = sc.next();
        int len = str.length() * (str.length() + 1) / 2;
        int cnt = 0;
        String[] arr = new String[len];
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                arr[cnt] = str.substring(i, j + 1);
                cnt += 1;
            }

        }
        for (String unit : arr) {
            ht.put(unit, unit);
        }
        System.out.println(ht.size());
    }
}
