package ytOops;


class Car {
    int wheels;
    int model;

    public void printdetails(int wheels) {
        System.out.println("The car has " + wheels + " wheels");
    }

    public void printdetails(String model) {
        System.out.println("It's a " + model + " model");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.wheels = 4;
        car1.model = 2024;

        car1.printdetails(car1.wheels);         // Call the int method
        car1.printdetails(String.valueOf(car1.model)); // Call the String method
    }
}

