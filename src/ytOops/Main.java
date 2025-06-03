package ytOops;

class  Car{
    int wheels;
    int model;
    int widnows;

    public void speed(){
        System.out.println("100k per hours");
    }

}

public class Main {
    public static void main(String[] args) {

    Car car1 = new Car();
    car1.wheels=4;
    car1.model= 2024;
    car1.widnows=4;
    car1.speed();
    }
}
