package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.price = 5000;
        calc.brand = "Casio";
        calc.adding(3, 4);
        calc.minus(5, 6);
        calc.mul(6, 7);
        calc.divide(5, 6);
        calc.factorial(10);
    }
}
