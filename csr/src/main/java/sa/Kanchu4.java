package sa;

 class Test{
    int count;
    Test(){
        count++;
    }
    public void printCount(){
        System.out.println(count);
    }
}

public class Kanchu4 {
    public static void main(String[] args) {

        Test t1= new Test();
        Test t2= new Test();
        Test t3= new Test();
        t1.printCount();;
        t2.printCount();
        t3.printCount();
    }
}
