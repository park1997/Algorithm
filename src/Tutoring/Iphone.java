package Tutoring;

public class Iphone {
    String number;
    String comu;
    int fee;
    String name;
    int age;

    public Iphone() {
        System.out.println("constructor");
    }

    public void call() {
        System.out.println("calling~~" + number);
    }

    public void off(String something,int num) {
        System.out.println("off~~~"+something);
        System.out.println(num);
    }

    public void on() {
        System.out.println("on~~");
    }

    public void info() {
        System.out.println("number : "+number);
        System.out.println("comu : "+comu);
        System.out.println("fee : "+fee);
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }



}
