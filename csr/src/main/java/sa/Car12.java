package sa;

public class Car12 {
    static int count;
    Car12(){
        count++;
    }
    static void printCount(){
        System.out.println(count);
    }
}
class Question12{
    public static void main(String[] args) {
        Car12 c1 = new Car12();
        Car12 c2 = new Car12();
        Car12 c3 = new Car12();
        Car12 c4 = new Car12();
        Car12 c5 = new Car12();
        c2.printCount();
        c5.printCount();
    }

}
