class EmployeeTest {
public static void main(String[] args) {
Employee emp1 = new Employee("Akshata", "malavi", 5000);
Employee emp2 = new Employee("Ankita", "patil", 7000);
System.out.println("Before Raise:");
System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s Yearly Salary: $" + emp1.getYearlySalary());
System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s Yearly Salary: $" + emp2.getYearlySalary());
emp1.giveRaise();
emp2.giveRaise();
System.out.println("\nAfter 10% Raise:");
System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s Yearly Salary: $" + emp1.getYearlySalary());
System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s Yearly Salary: $" + emp2.getYearlySalary());
}
}
