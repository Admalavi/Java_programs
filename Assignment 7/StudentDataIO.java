import java.io.*;
import java.util.Scanner;

public class StudentDataIO {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("student.dat");

        // Writing student data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            System.out.print("Enter name: ");
            dos.writeUTF(sc.nextLine());

            System.out.print("Enter age: ");
            dos.writeInt(sc.nextInt());

            System.out.print("Enter weight: ");
            dos.writeDouble(sc.nextDouble());

            System.out.print("Enter height: ");
            dos.writeDouble(sc.nextDouble());
            sc.nextLine(); // consume newline

            System.out.print("Enter city: ");
            dos.writeUTF(sc.nextLine());

            System.out.print("Enter phone number: ");
            dos.writeUTF(sc.nextLine());
        }

        // Reading student data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println("\nStudent Data:");
            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readDouble());
            System.out.println("Height: " + dis.readDouble());
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readUTF());
        }
    }
}
