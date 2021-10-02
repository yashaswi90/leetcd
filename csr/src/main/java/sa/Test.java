package sa;

public class Test {
    public static void main(String[] args) {
        try{
            assert false;
            System.out.println("t");
        }catch(Error e){
            System.out.println("c");
        }
    }
}
