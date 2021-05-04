package Cardmaking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Card mycard = new Card(2000);
        mycard.setnum("12345678");
        mycard.name = "박병현";
        mycard.overdate = "2025/01/01";
        mycard.password = 1234;


        mycard.deposit(1000);

        mycard.pay(1500);

        mycard.info();



    }
}
