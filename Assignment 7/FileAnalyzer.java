import java.io.*;

public class FileAnalyzer {
    public static void main(String[] args) {
        int vowels = 0, words = 0, aCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                words += line.split("\\s+").length;
                for (char ch : line.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(ch) != -1) vowels++;
                    if (ch == 'a') aCount++;
                }
            }

            reader.close();
            System.out.println("Total vowels: " + vowels);
            System.out.println("Total words: " + words);
            System.out.println("Occurrences of 'a': " + aCount);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
