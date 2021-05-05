package mungmung;

public class Dog {
    String type;
    int age;
    String name;
    int picnic_time;
    String color;
    boolean youhave;
    int happy;


    public Dog() {
        System.out.println("개가 태어났어요!");
        age = 0;
        happy = 0;
        picnic_time = 0;
    }
    public void eat(int a) {
        happy += a;
        if (happy >= 100) {
            System.out.println("저는 현재 " + a + "만큼 먹었고, 현재 " + happy + "만큼 배불러요");
        }else{
            System.out.println(a + "만큼 준건 고마운데 " + (100 - happy) + "만큼 더 줘야 행복할것 같네요");
        }
    }
    public void bite(int s) {
        if (s >= 50) {
            System.out.println("아 아파!!");
        }else{
            System.out.println("간지럽 ㅋㅅㅋ");
        }
    }
    public void walwal(int d) {
        if (d >= 100) {
            System.out.println("개 짖는 소리좀 안나게 해라 !");
        }else{
            System.out.println("착하다 밥 5 만큼 더줄게 !");
            happy += 5;
        }
    }

    public void picnic(int t) {
        picnic_time += t;
        if (picnic_time >= 100) {
            System.out.println("자 이제 집가서 씻겨줘");
        }else{
            System.out.println(picnic_time+"만큼 산책하느라 고생한건 알겠는데 난 "+(100-picnic_time)+"더 산책해야 안물거야 !");
        }

    }

    public void info() {
        System.out.println("배부른 정도 "+happy);
    }

}
