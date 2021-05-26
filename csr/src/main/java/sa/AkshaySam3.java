package sa;

public class AkshaySam3 {
    public static void main(String[] args) {
        AkshaySam2 akshaySam2 = new AkshaySam2();
        try {
            akshaySam2.callAk1();
        }catch(RuntimeException re){
            System.out.println("re main cause");
        }
    }
}
