public class Main {
    public static void main(String[] args) {

        int first = 1;
        int second = 1;
        int result;
        int end = 10;
        for(int i=1; i<=end; i++){
            result=first+second;
            System.out.println(result);
            first=second;
            second=result;
        }

    }
}
