import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String myname = "byunghyun";
        // charAt
        char[] array = new char[1024];

        for(int i=0 ; i < myname.length() ; i++) {
            array[i] = myname.charAt(i);
            System.out.print(array[i]);
        }

//        System.out.println(Arrays.toString(array));
//         배열의 i번쨰 원소는 내이름의 i번째 문자다!
    }

}
