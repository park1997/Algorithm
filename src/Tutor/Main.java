package Tutor;

public class Main {
    public static void main(String[] args) {
        Grandeur myCar1 = new Grandeur();
        myCar1.color = "Black";
        myCar1.gear = "auto";
        myCar1.price = 3000;

        myCar1.run();
        myCar1.stop();
        myCar1.info();

        Grandeur myCar2 = new Grandeur();
        myCar2.color = "blue";
        myCar2.gear = "manual";
        myCar2.price = 2500;

        myCar2.run();
        myCar2.stop();
        myCar2.info();

    }
}