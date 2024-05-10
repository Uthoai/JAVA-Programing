package OOP.Inheritance;

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.honk();
    }
}

class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven...");
    }
}
class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking...");
    }
}
