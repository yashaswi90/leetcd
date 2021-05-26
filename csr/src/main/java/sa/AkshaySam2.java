package sa;

public class AkshaySam2 {
    public void callAk1() {
        AkshaySam1 akshaySam1 = new AkshaySam1();
        System.out.println("insode sam2");
//        try {
            akshaySam1.shouldThrowSomeRuntimeException();
//        } catch (RuntimeException e) {
//            System.out.println(e.getCause());
//        }
        System.out.println("outside after call");
    }
}
