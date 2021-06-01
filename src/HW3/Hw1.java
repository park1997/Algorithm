package HW3;

import java.util.Arrays;
import java.util.Scanner;
class HashTable{
    String[] keys;
    Integer[] values;
    int M;
    int cnt = 0;
    HashTable(int m) {
        keys = new String[m];
        values = new Integer[m];
        this.M = m;
    }
    // get hash value if specified key.
    int hash(String key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }
    // Store <key, value> pair at specified key space
    void put(String key, int value) {
        int h = hash(key);
        if (key.equals(keys[h])) {
            cnt += 1;
        }
        // 비어있지 않으면 다음칸에 넣도록 함
        // M 주기로 하기위해 %M 을 함
        while (keys[h] != null) {
            h = (h + 1) % M;
        }
        keys[h] = key;
        values[h] = value;
    }
    // if key exist, return the value or return null
    Integer get(String key) {
        int h = hash(key);
        // key 값이 null 이 아니면 계속 돌건데
        while (values[h] != null) {
            // 키값이 받아온 키값과 같으면 break
            if (key.equals(keys[h])) {
                break;
            }
            h = (h + 1) % M;
        }
        // null이면 못찾았다는 거임
        if (keys[h] == null) {
            return null;
        }
        // 찾으면 찾은 value를 return
        return values[h];
    }
    void remove(String key) {
        int h = hash(key);
        while (values[h] != null) {
            // null에대해서 함수가 호출이 안되어서 이렇게 조건달아야함
            if (key.equals(keys[h])) {
                keys[h] = null;
                return;
            }
            h = (h + 1) & M;
        }
    }
    // check if specified key exist at hash table
    boolean contains(String key) {
        int h = hash(key);
        while (values[h] != null) {
            if (key.equals(keys[h])) {
                return true;
            }
            h = (h + 1) % M;
        }
        return false;
    }

}


public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length() * (str.length() + 1) / 2;
        int cnt = 0;
        String[] arr = new String[len];
        HashTable ht = new HashTable(5050);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                arr[cnt] = str.substring(i, j + 1);
                cnt += 1;
            }

        }
//        System.out.println(arr.length+" "+len);
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            ht.put(arr[i], 1);
        }

        System.out.println(len-ht.cnt);





    }
}
