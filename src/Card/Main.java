package Card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Card mycard = new Card();

        mycard.name = "박병현";
        mycard.pw = 1234;
        mycard.money = 1000;
        mycard.cardnum = "1234 5678 9012 3456";


        System.out.println();
        mycard.pay(500,"2020/5/5");
        Scanner sc = new Scanner(System.in);
        int PW = sc.nextInt();
        mycard.info(PW);

    }
}
