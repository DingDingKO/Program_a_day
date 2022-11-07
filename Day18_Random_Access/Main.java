package Day18_Random_Access;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;
/* Day 18:
* A program which randomly accesses a phrase in a file using random access.
* */
public class Main {
    public static void main(String[] args) {
        Path file = Paths.get("src/main/java/Day18_Random_Access/phrases");
        Path filePath = file.toAbsolutePath();
        int random = (int) (Math.random() * 9);
        final int LENGTH_OF_PHRASES = 14; // All the phrases are 14 characters long
        byte[] b = new byte[LENGTH_OF_PHRASES];
        FileChannel fc = null;
        ByteBuffer buffer = ByteBuffer.wrap(b);

        try {
            fc = (FileChannel) Files.newByteChannel(filePath, READ);
            fc.position((int) random * LENGTH_OF_PHRASES);
            fc.read(buffer);
            String outputString = new String(b);
            System.out.println("Hello there! " + outputString);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
