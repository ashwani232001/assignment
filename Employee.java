public class Employee {
     long employeeID;
     String employeeName;
    String employeeAddress;
     long employeePhone;
     double basicSalary;
     double specialAllowance = 250.80;
     double hra=1000.50;

    public Employee(long id, String name, String Address, long phone, double salary) {
        this.employeeID = id;
        this.employeeName = name;
        this.employeeAddress = Address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }
    public void calculateSalary() {
        double salary =basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
        System.out.println("Salary for employee"+ employeeName +" is:"+salary);
    }
    public void calculateTransportAllowance() {
        double transportAllowance = 10.0 * basicSalary/100;
        System.out.println(" Transport allowance for employee" + employeeName +" is:" + transportAllowance);
    }
}

class Manager extends Employee{
    public Manager(long id,String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);
        super.basicSalary=salary;
    }
    
    public void calculateTransportAllowance() {
        double transportAllowance =15.0*basicSalary/100;
        System.out.println(" Transport allowance for Manager" + employeeName +" is:" + transportAllowance);
    }
}
class Trainee extends Employee{
    public Trainee (long id,String name,String address, long phone,double salary){
        super(id, name, address, phone, salary);
    }
}
