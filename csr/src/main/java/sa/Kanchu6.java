package sa;


class Vehical1 {
    int maxSpeed = 200;

    public static void drive() {
        System.out.println("Driving PArent Vehical");
    }

    public void race() {
        System.out.println("Driving Parent speed" + maxSpeed);
    }
}


class Car1 extends Vehical1 {
    int maxSpeed = 180;

    public static void drive() {
        System.out.println("Driving Child Vehical");
    }

    public void race() {
        System.out.println("Driving Child speed" + maxSpeed);
    }
}

public class Kanchu6 {
    public static void main(String[] args) {

        Vehical1 vehical1 = new Car1();
        vehical1.drive();
        vehical1.race();
        System.out.println(vehical1.maxSpeed);


        Car1 car = new Car1();
        car.drive();
        car.race();
        System.out.println(car.maxSpeed);

    }
}
