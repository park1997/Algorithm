package Tutoring;

/*
    눈에보이는것들
    자동차 자전거 아이폰 갤럭시노트

    프로그래밍에서의 객체
    날씨프로그램
    계산기프로그램
    객체 : 세상에 존재하는 모든것들  프로그래밍에서는 속성과 기능을 가진 프로그램의 단위이다.


    아이폰

    전화번호
    통신사
    요금제
    소유주이름
    소유주 나이


    기능(메소드)
    전화하기
    문자보내기
    나의핸드폰정보보여주기 기능
    핸드폰켜기
    핸드폰끄기
     */




public class Main {
    public static void main(String[] args) {
        Iphone myphone = new Iphone();


        myphone.number = "010-1234-5678";
        myphone.comu = "KT";
        myphone.fee = 590;
        myphone.name = "박병현";
        myphone.age = 25;

        myphone.call();//calling~~010-1234-5678

        myphone.info();

        myphone.off("byebyebyebyebye",12);
        myphone.on();

    }
}
