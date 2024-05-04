public class Company {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];
        
        Employees[0] = new Employee("Michał Lenard", 20000);
        Employees[1] = new Employee("Jan Kowalski", 10000);
        Employees[2] = new Employee("Szymon Nowak", 5000);
        Employees[3] = new Employee("Piotr Kropka", 6000);
        Employees[4] = new Employee("Aneta Marzec", 7000);

        System.out.println("Pracownik o indeksie 3:");
        System.out.println(Employees[3]);
        
        Employees[3].setSalary(9000);

        System.out.println("Dane o wszystkich pracownikach:");
        System.out.println(Employees[0]);
        System.out.println(Employees[1]);
        System.out.println(Employees[2]);
        System.out.println(Employees[3]);
        System.out.println(Employees[4]);
    }
}