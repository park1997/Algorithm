package Tutor;

class Grandeur {
    public String color;
    public String gear;
    public int price;

    public Grandeur() {
        // 생성을 할때 필요한 기능들을 구성
        // 제일먼저 호출도딤
        System.out.println("-- constructor --");
    }

    public void run() {
        System.out.println("--- run ---");
    }

    public void stop() {
        System.out.println("-- stop --");
    }

    public void info() {
        System.out.println(" color : "+this.color);
        System.out.println(" gear : "+this.gear);
        System.out.println("price : "+this.price);
    }


}
