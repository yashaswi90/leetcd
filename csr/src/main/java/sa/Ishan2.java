package sa;

public class Ishan2 {

    String name;
    String address;

    public void getDetail(String name,String address){
        System.out.println("Name is "+ name);
        System.out.println("Addrees is "+ address);
    }

    public static void main(String[] args) {
        Ishan2 id = new Ishan2();
        id.getDetail("Ishan Dutt","Pune");
    }


}
