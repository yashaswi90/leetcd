package sa;

public class CerenTest {
    public static void main(String[] args) {
        CerenB b = new CerenB();
        CerenC c = new CerenC();
//        b = c;
        newPrint(b);
    }

    private static void newPrint(CerenA a) {
        a.printName();
    }
}
