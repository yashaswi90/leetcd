package sa;

public class CatchExitFinally {
    public static void main(String[] args) {

    }

    public void checkCatch(){
        int a=10,b;
        try{
             b =  a/0;
        }catch(Exception e){
            System.exit(1);
        }finally {
            System.out.println("Hello");
        }
    }
}
