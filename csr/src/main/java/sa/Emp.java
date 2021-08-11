package sa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class Emp implements Serializable {

    private static final long serialVersionUID = 7488921480006384819L;
    private String name;
    private String id;


    public Emp(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
class EmpMain{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Emp e=new Emp("Yashi","0033522");
        Emp e1=new Emp("Yashi2","0033524");
        ObjectStreamClass c = ObjectStreamClass.lookup(Emp.class);
        long serialID = c.getSerialVersionUID();
        System.out.println(serialID);

        FileOutputStream fos
                = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);

        oos.writeObject(e);


        FileInputStream fis
                = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Creating object of class 'Geeks'

        FileOutputStream fos1
                = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos1
                = new ObjectOutputStream(fos);

        oos.writeObject(e1);


        FileInputStream fis1
                = new FileInputStream("xyz.txt");
        ObjectInputStream ois1 = new ObjectInputStream(fis);

        Emp g1 = (Emp)ois.readObject();

        // Print and display the
        // deserialized object value
        System.out.println("Deserialized Object Value:"
                + g1.getName() + "..." + g1.getId()+serialID);


        // Creating object of class 'Geeks'
        Emp g2 = (Emp)ois.readObject();

        // Print and display the
        // deserialized object value
        System.out.println("Deserialized Object Value:"
                + g2.getName() + "..." + g2.getId()+serialID);

    }
}