package homework;


public class CreatingObj {
    public static void main(String[] args) {

        Manager manager = new Manager("Aleksei", 35, "+372555", "London 22-33", 3000, "AMERIKA");
        manager.printSalary();
        Employee employee = new Employee("Fedor", 19, "+3724444", "NewYersey", 1300, "Worker");
        employee.printSalary();

    }
}
