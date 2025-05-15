import java.io.*;
import java.util.Scanner;

public class FileEditor {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        if (args.length < 1) {
            System.out.println("Please provide a file name as command line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists. Contents:");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            System.out.print("\nDo you want to add data to the end of the file? (Yes/No): ");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("Yes")) {
                FileWriter fw = new FileWriter(file, true);
                System.out.println("Enter data to append (type 'exit' to stop):");
                while (true) {
                    String data = sc.nextLine();
                    if (data.equalsIgnoreCase("exit")) break;
                    fw.write(data + "\n");
                }
                fw.close();
            }

        } else {
            System.out.println("File does not exist. Creating new file.");
            FileWriter fw = new FileWriter(file);
            System.out.println("Enter data to store (type 'exit' to stop):");
            while (true) {
                String data = sc.nextLine();
                if (data.equalsIgnoreCase("exit")) break;
                fw.write(data + "\n");
            }
            fw.close();
        }
    }
}
