package MyLab17;

import java.util.Scanner;

// hashtable 만들기(1차 조사)
/*
key : 존재 , value : 존재 => 실제로 존재
key = null , value : 존재 => 지워진 값
key = null, value = null => 비어있는 값
int로는 안된 참조형 자료변수(Integer)로 바꾸어줘야 null값을 처리 할 수있음
 */
class HashTable{
    String[] keys;
    Integer[] values;
    int M;
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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashTable map = new HashTable(449);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        while (true) {
            String cmd = sc.next();
            if (cmd.equals("quit")) {
                break;
            }
            if (cmd.equals("add")) {
                String key = sc.next();
                int value = sc.nextInt();
                map.put(key, value);
            } else if (cmd.equals("remove")) {
                String key = sc.next();
                map.remove(key);
            } else if (cmd.equals("find")) {
                String key = sc.next();
                if (!map.contains(key)) {
                    System.out.println(key + " is not found.");
                } else {
                    System.out.println(key + " is " + map.get(key) + ".");
                }
            }
        }


    }

}
