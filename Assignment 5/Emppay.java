import employee.*;
import java.util.Scanner;
public class Emppay {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter employee id:");
    String empid = sc.next();

    System.out.println("enter employee name:");
    sc.nextLine();
    String empname = sc.nextLine();

    System.out.println("enter basic payy:");
    sc.nextLine();
    String bpay = sc.nextLine();

    Emp emp = new Emp(empid, empname, 0);
    emp.display();

    sc.close();

   } 
}
