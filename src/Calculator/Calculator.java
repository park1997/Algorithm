package Calculator;
    /*
    계산기

    계산기 속성 : 색깔, 가격, 브랜드

    기능
    덧셈, 뺄셈, 곱셈 , 나눗셈 , 팩토리얼

    */

public class Calculator {
    String color;
    int price;
    String brand;

    public Calculator() {
        System.out.println("계산기가 생성되었습니다!");
    }

    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public void minus(int a, int b) {
        System.out.println(a-b);
    }
    public void mul(int a , int b) {
        System.out.println(a*b);
    }
    public void div(int a, int b) {
        System.out.println((float)a/b);
    }

    public void factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public void info() {
        System.out.println("color : " + color);
        System.out.println("price : " + price);
        System.out.println("brand : " + brand);
    }





}
