import java.util.Arrays;
import java.util.Scanner;

class AlphabeticalOrder {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String[] names = new String[10];

System.out.println("Enter 10 names:");
for (int i = 0; i < 10; i++) {
names[i] = scanner.next();
}
Arrays.sort(names);
System.out.println("\nNames in alphabetical order:");
for (String name : names) {
System.out.print(name+"\t");
}
scanner.close();
}
}