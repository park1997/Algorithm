package Card;

public class Main {
    public static void main(String[] args) {
        Card mycard = new Card();

        mycard.number = "1234 5678 9012";
        mycard.password = 1234;
        mycard.name = "박병현";
        mycard.money = 0;
        mycard.overdate = "2025/01/01";
        mycard.company = "농협";

        mycard.deposit(3000);
        mycard.pay(4000);

        mycard.info();


    }
}
