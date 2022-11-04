package Day14_Files;
/* Day 14:
* A quick look at how to read files in Java.
*/

import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Path file = Paths.get("src/main/java/Day14_Files/hello.txt");
        Path filePath = file.toAbsolutePath();
        String fromFile = "";
        BufferedReader reader = null;
        try {
            InputStream inputStream = new BufferedInputStream(Files.newInputStream(filePath));
            reader = new BufferedReader(new InputStreamReader(inputStream));
            do {
                System.out.println(fromFile);
                fromFile = reader.readLine();
            }
            while (fromFile != null);

        } catch (Exception e) {
            System.out.println("Message: " + e);
        } finally {
            reader.close();
        }


    }
}
