package homework;


public class Manager extends Member {

    private String department;


    public Manager(String name, int age, String phoneNumber, String adress, int salary, String department) {
        super(name, age, phoneNumber, adress, salary);
        this.department = department;

    }

    public void printSalary() {
        System.out.println("Manager Info :");
        System.out.println("Salary is " + salary);
        System.out.println("Department is " + department);
    }

}
