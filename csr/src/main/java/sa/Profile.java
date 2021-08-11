package sa;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Profile {
    private Profile(int w){
        System.out.println(w);
    }
    public Profile(){
        System.out.println(10);
    }

    public static void main(String[] args) {

        Scanner s ;
        /*try(s=new Scanner(System.in)){

        }*/
        int []a;

        a=new int[-10];
        a[10]=20;
        Profile p = new Profile(50);
int[] arr =new int[]{2,3,4,5};
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        arr = Arrays.copyOf(arr, 10);
        Arrays.stream(arr).forEach(System.out::println);
        list.set(0,5);
        System.out.println(list);
    }
}
interface StaticInterface{
    static void staticMethod(){
        System.out.println(" h");
    }
}
class StaticInterImpl implements StaticInterface{public void staticMethod(){
    System.out.println("insdie ");
}}
class StaticMAin{
    Optional<String> alternaEmail;
    public Optional<String> getAtler(){
        return alternaEmail;
    }

    public void setAlternaEmail(Optional<String> alternaEmail) {
        this.alternaEmail = alternaEmail;
    }

   /* public StaticMAin(Optional<String> alternaEmail) {
        this.alternaEmail = alternaEmail;
    }
*/
    public static void main(String[] args) throws IOException {
        new StaticInterImpl().staticMethod();




        StaticMAin staticMAin11=new StaticMAin();
        StaticMAin staticMAin22=new StaticMAin();

        /*staticMAin11.setAlternaEmail(Optional.of("tom tom"));
        StaticMAin staticMAin1=new StaticMAin(Optional.of(new String("hello")));


        System.out.println(staticMAin.getAtler().orElse("Defaul"));
        System.out.println(staticMAin1.getAtler().orElse("Defaul"));



        StaticMAin staticMAin=new StaticMAin(Optional.of(new String("hello")));
        staticMAin.setAlternaEmail(Optional.of("tom tom"));
        StaticMAin staticMAin1=new StaticMAin(Optional.of(new String("hello")));
*/
/*

        System.out.println(staticMAin.getAtler().orElse("Defaul"));
        System.out.println(staticMAin1.getAtler().orElse("Defaul"));
        System.out.println(staticMAin.getAtler().isPresent());
*/





        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER,11);
        LocalDate date2 = LocalDate.of(2016, 11,12);
//        LocalDate date2 = LocalDate.of(12, 11,2016);
        System.out.println(date2);
        date1.compareTo(date2);
        System.out.print(date1.compareTo(date2));
        Stream<Integer> integerStream = Stream.of(8, 7, 10, 15, 20, 22, 30);
        System.out.println(integerStream.filter((n) -> n%5 == 0).count());

        FileInputStream fileInputStream=null;
        BufferedInputStream bufferedInputStream=null;
      /*  try(FileOutputStream fos =new FileOutputStream(".txt"); BufferedOutputStream bos =new BufferedOutputStream(fos) {
        } catch (Exception e){
        }*/
    }
}