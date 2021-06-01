package MyLab17_2;

import java.util.Scanner;

// hashtable 만들기(2차 조사)
// 더블 해싱
// 데이터가 이미 꽉차있는데 더넣게되면 무한루프에 빠지게됨

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

    // double hasing function
    int hash2(String key) {
        // 19번째 줄 M은 13임 근데 우연치않게 여기에 17이아니라 13인경우에는 무한루프를 돌게됨 M보다 작은 값을 해줘야함 그러면 문제가 발생하지 않음 모든 공간을 탐색할 수 있게됨
        return (key.hashCode() & 0x7fffffff) % 7 + 1; // +1 안하면 우연찮게 0 이되는 경우가 있어서 step을 0만 더하다보니까 현재주소를 계속 찾고 있었던 것임
    }
    // Store <key, value> pair at specified key space
    void put(String key, int value) {
        int h = hash(key);
        int step = hash2(key);
        // 비어있지 않으면 다음칸에 넣도록 함
        // M 주기로 하기위해 %M 을 함
        while (keys[h] != null) {
            h = (h + step) % M;
        }
        keys[h] = key;
        values[h] = value;
    }
    // if key exist, return the value or return null
    Integer get(String key) {
        int h = hash(key);
        int step = hash2(key);
        // key 값이 null 이 아니면 계속 돌건데
        while (values[h] != null) {
            // 키값이 받아온 키값과 같으 break
            if (key.equals(keys[h])) {
                break;
            }
            h = (h + step) % M;
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
        int step = hash2(key);
        while (values[h] != null) {
            // null에대해서 함수가 호출이 안되어서 이렇게 조건달아야함
            if (key.equals(keys[h])) {
                keys[h] = null;
                return;
            }
            h = (h + step) & M;
        }
    }
    // check if specified key exist at hash table
    boolean contains(String key) {
        int h = hash(key);
        int step = hash2(key);
        while (values[h] != null) {
            if (key.equals(keys[h])) {
                return true;
            }
            h = (h + step) % M;
        }
        return false;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashTable map = new HashTable(13);
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
