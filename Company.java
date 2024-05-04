import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];
        
        Employees[0] = new Manager ("Michał Lenard", 20000, 0);
        Employees[1] = new Worker("Jan Kowalski", 10000, "pracownik");
        Employees[2] = new Employee("Szymon Nowak", 5000);
        Employees[3] = new Employee("Piotr Kropka", 6000);
        Employees[4] = new Worker("Aneta Marzec", 7000, "pracownik");

        System.out.println("Dane o wszystkich pracownikach:");
        System.out.println(Employees[0]);
        System.out.println(Employees[1]);
        System.out.println(Employees[2]);
        System.out.println(Employees[3]);
        System.out.println(Employees[4]);
    }
}