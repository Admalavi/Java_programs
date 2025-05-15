import java.io.*;

public class ReadExternalFile {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt"); // same folder as your .java file
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
