package Algorithm.Lec0908;
// 팩토리얼의 계산
public class Lec_0908_2 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);    // 재귀호출
        }
    }
    public static void main(String[] args) {
        int answer;
        int n = 10;
        answer = factorial(n);
        System.out.println(n + "의 계승 = " + answer);
    }
}
