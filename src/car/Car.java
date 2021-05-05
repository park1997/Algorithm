package car;

public class Car {
    String color;
    String name;
    String brand;
    int temper = 35;
    String handle_shape;
    boolean insurance;

    // 생성자
    public Car() {
        System.out.println("차가 생성 되었습니다!");
    }
    public void run() {
        if (insurance) {
            System.out.println("역시 보험을 들고 차를 운전해야죠 ");
        }else{
            System.out.println("보험 값 아끼다가 혼납니다");
        }
    }
    public void music_on(String music_name) {
        System.out.println(music_name+"을 틀도록 하겠습니다");
    }
    public void aircon_on() {
        System.out.print("현재온도는 "+temper+"도 이고 ");
        temper -= 5;
        System.out.println("에어컨 틀었으니까 "+temper+"도 될거야 ");
    }
}
