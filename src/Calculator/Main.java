package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        calc.color = "black";
        calc.price = 10000;
        calc.brand = "Casio";

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        calc.add(a1,a2);
        calc.minus(a1,a2);
        calc.mul(a1,a2);
        calc.div(a1, a2);
        calc.factorial(a1);

        calc.info();






    }
}
