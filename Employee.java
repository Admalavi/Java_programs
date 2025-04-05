class Employee {
private String fname;
private String lname;
private double molsal;
public Employee(String f, String l, double a) {
fname = f;
lname = l;
molsal = (a > 0) ? a : 0.0;
}
public void setFirstName(String firstName) {
this.fname = firstName;
}
public void setLastName(String lastName) {
this.lname = lastName;
}
public void setMonthlySalary(double monthlySalary) {
if (monthlySalary > 0) {
this.molsal = monthlySalary;
} else {
this.molsal = 0.0;
}
}
public String getFirstName() {
return fname;
}
public String getLastName() {
return lname;
}
public double getMonthlySalary() {
return molsal;
}
public double getYearlySalary() {
return molsal * 12;
} 
public void giveRaise() {
molsal *= 1.10;
}
}
public static void main(String args[]){
	
}
