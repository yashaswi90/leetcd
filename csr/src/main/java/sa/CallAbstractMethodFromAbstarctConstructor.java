package sa;


public abstract class CallAbstractMethodFromAbstarctConstructor {
    public CallAbstractMethodFromAbstarctConstructor() {
        display();
    }

    abstract void display();


}


 class Sub extends CallAbstractMethodFromAbstarctConstructor{

    @Override
    public void display() {
        System.out.println("hello");
    }


}

class SubMain{
    public static void main(String[] args) {
            new Sub();
    }
}