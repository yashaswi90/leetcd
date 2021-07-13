package sa;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.stream.Stream;

public class FileChanUse {
    public static void main(String[] args) throws IOException {
     /*   System.out.println(Instant.now());
       try(Stream<String> lines = Files.lines(Paths.get("D:\\Event-Management Project\\Developement-TP\\leetcd\\leetcd\\csr\\src\\main\\resources\\tarjan.txt"))){
           lines.forEach(System.out::println);
       }catch (Exception e){
           System.out.println("Noooooooooooo");

       }
        System.out.println(Instant.now());


*/

        RandomAccessFile aFile = new RandomAccessFile("D:\\\\Event-Management Project\\\\Developement-TP\\\\leetcd\\\\leetcd\\\\csr\\\\src\\\\main\\\\resources\\\\tarjan2", "r");

        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(100);
        while(inChannel.read(buffer) > 0)
        {
            buffer.flip();
            for (int i = 0; i < buffer.limit(); i++)
            {
                System.out.print((char) buffer.get());
            }
            buffer.clear(); // do something with the data and clear/compact it.
        }

        inChannel.close();
        aFile.close();


    }
}
