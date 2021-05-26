package sa;

public class Akanchu {
    public Akanchu() {
        System.out.println("Line1");
    }

    public void a() {
        System.out.println("Line 2");
    }
}

class Bkanchu extends Akanchu {
    public Bkanchu() {
        System.out.println("Line3");
    }

    public void b() {
        System.out.println("Line 4");
    }
}

class Ckanchu extends Bkanchu {
    public Ckanchu() {
        System.out.println("Line 5");
    }

    public void c() {
        System.out.println("Line 6");
    }
}

class Question10 {
    public static void main(String[] args) {
        Bkanchu bkanchu = new Ckanchu();
        bkanchu.a();

    }
}

