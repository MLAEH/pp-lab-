import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    
    public static void main(String[] args) {
        Employee[] Employees = new Employee[7];
        
        Employees[0] = new Manager ("Michał Lenard", 20000, 5);
        Employees[1] = new Worker("Jan Kowalski", 10000, "pracownik");
        Employees[2] = new Employee("Szymon Nowak", 5000);
        Employees[3] = new Employee("Piotr Kropka", 6000);
        Employees[4] = new Worker("Aneta Marzec", 7000, "pracownik");
        Employees[5] = new Manager ("Adam M", 10000, 5);
        Employees[6] = new Worker("Karcper K", 9000, "pracownik");

        Employees[0].setSalary(20500);
        Employees[1].setSalary(15000);
        Employees[2].setSalary(5500);
        Employees[3].setSalary(6500);
        Employees[4].setSalary(7500);
        Employees[5].setSalary(10500);
        Employees[6].setSalary(9500);

        Employees[0].setSalary(7500);
        Employees[6].setSalary(7500);

        System.out.println("Dane o wszystkich pracownikach:");
        System.out.println(Employees[0]);
        System.out.println(Employees[1]);
        System.out.println(Employees[2]);
        System.out.println(Employees[3]);
        System.out.println(Employees[4]);
        System.out.println(Employees[5]);
        System.out.println(Employees[6]);
    }
}