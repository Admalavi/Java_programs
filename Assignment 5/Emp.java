package employee;
public class Emp {
    String empname, empid;
    double  da,bpay, hra , npay, pf, grosspay, incometax, allowance;

    public Emp(String empid, String empname, double bpay) {
        this.empid = empid;
        this.empname = empname;
        this.bpay = bpay;
        calculateSalary();
    }

    private void calculateSalary() {
        da = 0.05 * bpay;
        hra = 0.09 * bpay;
        pf = 0.11 * bpay;
        allowance = 0.10 * bpay;

        grosspay = bpay + da + hra + allowance;
        incometax = 0.1 * grosspay;
        npay = grosspay - (pf + incometax);

    }
    public void display() {
        System.out.println("employee ID: " + empid);
        System.out.println("employee name: " + empname);
        System.out.println("basic pay: " + bpay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("allowance: " + allowance);
        System.out.println("grosspay: " + grosspay);
        System.out.println("PF: " + pf);
        System.out.println("incometax: " + incometax);
        System.out.println("net pay: " + npay);

    }

}
