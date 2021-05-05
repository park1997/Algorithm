package Card;

/*
    카드

    속성
    소유주 이름, 비밀번호, 잔액, 카드번호

    기능(메소드)
    결제하기, 입금하기, 현재 잔액 확인하기

 */

public class Card {
    String name;
    int pw;
    int money;
    String cardnum;

    public Card() {
        System.out.println("카드가 생성 되었습니다!");
    }

    public void pay(int mon, String date) {
        if ((money - mon) < 0) {
            System.out.println("출금할 수 없습니다");
        }else{
            money -= mon;
            System.out.println(date+"에 "+mon+" 원 결재 됐습니다!");
        }
    }

    public void deposit() {
        System.out.println("입금 되었습니다!");
    }

    public void info(int password) {
        if (password == pw) {
            System.out.println("현재 잔액은 "+money+ "입니다.");
            System.out.println("비밀번호는 "+pw);
            System.out.println("이름 : "+name);
            System.out.println("카드번호  : "+cardnum);
        }else{
            System.out.println("정보를 조회할수 없습니다");
        }

    }








}
