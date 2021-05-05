package mungmung;
/*
멍멍이

속성 : 견종, 나이, 이름, 산책한시간 , 털색깔, 중성화, 배부른정도

기능 : 밥먹기(10) => 100 이상이되면 행복해요~~출력
물기(무는강도) => 50 이 넘으면 아야~ 50이하면 간지럽네 ㅋ
짖기(데시벨) => 100 이상이면 개짖는소리 안나게해라~ 100이하면 밥을 5만큼 더주기
산책하기(산책한 시간)

현상태 출력하기 => 현재 나이 이름 산책한시간 털색깔 중성화 배부른정도

 */

public class Main {
    public static void main(String[] args) {
        Dog mung = new Dog();

        mung.type = "말티즈";
        mung.name = "몽뭉이";
        mung.color = "White";
        mung.youhave = true;

        mung.eat(48);
        mung.eat(52);
        System.out.println();

        mung.bite(40);
        mung.bite(100);
        System.out.println();

        mung.walwal(90);
        mung.info();
        mung.walwal(120);
        System.out.println();

        mung.picnic(90);
        mung.picnic(10);


        Dog mong = new Dog();
        mung.type = "말";
        mung.name = "뭉뭉이";
        mung.color = "White";
        mung.youhave = true;




    }
}
