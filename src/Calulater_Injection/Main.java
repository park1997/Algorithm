package Calulater_Injection;

public class Main {
    public static void main(String[] args) {

        MyCalculator calculator;

        calculator = new MyCalculator(10, 5, new CalAdd());
        calculator.result();

        calculator = new MyCalculator(10, 5, new CalSub());
        calculator.result();

        calculator = new MyCalculator(10, 5, new CalMul());
        calculator.result();

        calculator = new MyCalculator(10, 5, new CalDiv());
        calculator.result();

    }
}
