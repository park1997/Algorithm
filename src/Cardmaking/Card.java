package Cardmaking;

import java.util.Scanner;

public class Card {
    private String num;
    String name;
    String overdate;
    int password;
    long money = 0;
    Scanner sc = new Scanner(System.in);

    public Card(String num) {
        System.out.println("카드가 만들어졌어요~~");
    }
    public Card(long mon) {
        money = mon;
        System.out.println("카드가 만들어졌어요 2~~");
    }

    public void pay(long forpay) {
        if (money - forpay < 0) {
            System.out.println("결재할 수 없습니다");
        }else{
            money -= forpay;
        }
    }


    public void deposit(long fordeposit) {
        money += fordeposit;
    }

    public void info() {
        System.out.println("비밀번호를 입력해 주세요");
        int pw = sc.nextInt();
        if (password == pw) {
            System.out.println("내 카드 번호는 " + num);
            System.out.println("카드 소유주 이름은 "+name);
            System.out.println("만료일자는 "+overdate);
            System.out.println("패스워드는 "+password);
            System.out.println("현재 나의 잔고는 "+money);
        }else{
            System.out.println("비밀번호가 틀렸습니다");
        }
    }

    public void setnum(String nums) {
        num = nums;
    }

}
