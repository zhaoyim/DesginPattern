package design.patterns.composite;

public class CompositePatternDemo {

    public static void main(String[] args) {

        Employee ceo = new Employee("Jhon", "ceo", 30000);

        Employee headerSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee sales1 = new Employee("Richard", "Sales", 10000);
        Employee sales2 = new Employee("Rob", "Sales", 10000);

        ceo.add(headerSales);
        ceo.add(headMarketing);

        headerSales.add(sales1);
        headerSales.add(sales2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        printAllEmployeeInfo(ceo);

    }

    public static void printAllEmployeeInfo(Employee employee) {
        System.out.println(employee);
        if (employee.getSubordinates().size() != 0) {
            for (Employee e : employee.getSubordinates()) {
                printAllEmployeeInfo(e);
            }
        }
    }
}
