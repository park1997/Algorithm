package Card;
//카드
//카드번호, 비밀번호 , 소유주이름 , 잔고 , 만료기간
//기능
//결제하기, 입금하기, 현재들어있는 잔고 알려주기
public class Card {
    String number;
    int password;
    String name;
    int money;
    String overdate;
    String company;

    public Card() {
        System.out.println("카드가 생성 되었습니다~~");
    }
    public void pay(int forpay) {
        if (money - forpay < 0) {
            System.out.println("돈을 뺼수 없어요");
        }else{
            money -= forpay;
        }
    }
    public void deposit(int fordeposit) {
        money += fordeposit;
        System.out.println(fordeposit+"원 입금되었습니다!");
    }
    public void info() {
        System.out.println("내 현재 잔고는 : "+money);
    }
}
