package car;



public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.color = "Black";
        mycar.name = "병현";
        mycar.brand = "PORCHE";
        mycar.handle_shape = "타원은 아님";
        mycar.insurance = false;

        mycar.run();
        mycar.music_on("gdgd");
        mycar.aircon_on();


    }
}
