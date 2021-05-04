package Calculator;

public class Calculator {
    long price;
    String brand;
    public Calculator() {
        System.out.println("계산기 생성자 실행됐습니다.");
    }
    public void adding(int a, int b) {
        System.out.println(a+b);
    }
    public void minus(int a, int b) {
        System.out.println(a-b);
    }
    public void mul(int a, int b) {
        System.out.println(a*b);
    }
    public void divide(float a, float b) {
        System.out.println(a/b);
    }
    public void factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}