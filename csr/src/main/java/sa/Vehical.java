package sa;

public class Vehical {
    public void drive(){
        System.out.println("Vehical");
    }

}

class Car extends Vehical{
    public void drive(){
        System.out.println("Car");
    }
}


class Question{
    public static void main(String[] args) {
        Vehical c = new Car();
        c.drive();
    }


    //we cannot call parent class object from child object
}