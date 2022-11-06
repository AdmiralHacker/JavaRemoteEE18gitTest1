package homework;


public class Employee extends Member {
    private String specilization;


    public Employee(String name, int age, String phoneNumber, String adress, int salary, String specilization) {
        super(name, age, phoneNumber, adress, salary);
        this.specilization = specilization;
    }

    public void printSalary() {
        System.out.println("Employee info :");
        System.out.println("Salary is " + salary);
        System.out.println("Specilization is " + specilization);
    }
}
