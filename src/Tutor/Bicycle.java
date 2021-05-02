package Tutor;

public class Bicycle {
    public String color;
    public int price;

    public Bicycle() {
        System.out.println(" Bicycle constructor");
    }
    public Bicycle(String c, int p) {
        this.color = c;
        this.price = p;
        System.out.println("Bicycle constructor 2");
    }

    public void run() {
        System.out.println("-- run --");
    }
    public void stop() {
        System.out.println(" -- stop --");
    }


}
