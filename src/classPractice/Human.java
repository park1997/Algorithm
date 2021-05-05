package classPractice;

/*
인간 :

속성
키, 몸무게, 시력, IQ

메소드
달리기 인사하기 자기소개하기

 */

public class Human {
    int height;
    int weight;
    String see;
    int iq;

    public Human() {
        System.out.println("생성자 입니다.");
        System.out.println("진짜실행됐음");
    }

    public void run() {
        System.out.println("저는 뛰고있습니다!");
    }

    public void hi() {
        System.out.println("hi");
    }

    public void info(String a) {
        System.out.println("나의 키는 :"+height);
        System.out.println("나의 몸무게는 :"+weight);
        System.out.println("나의 시력은 :"+see);
        System.out.println("나의 아이큐는 :"+iq);
        System.out.println("나는 "+a+"가 아닙니다.");

    }







}
