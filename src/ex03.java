import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strarr = new String[str.length()*100];
        int count = 0;
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = str.substring(i, j + 1);
                System.out.println(i+" "+s);
                int h = s.hashCode() & 0x7fffffff;
                h = h % (strarr.length);
                if (strarr[h] != null) {
                    break;
                } else {
                    strarr[h] = s;
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(count+"개");
    }

}