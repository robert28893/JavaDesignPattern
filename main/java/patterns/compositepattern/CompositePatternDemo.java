package patterns.compositepattern;

/**
 * Created by Hoang Phuong on 10/31/2016.
 */
public class CompositePatternDemo {
    public static void main(String args[]) {
        Employee CEO = new Employee("Robert", "CEO", 30000);
        Employee headSales = new Employee("John", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee sale1 = new Employee("Richard", "Sales", 10000);
        Employee sale2 = new Employee("Rob", "Sales", 10000);

        Employee marketing1 = new Employee("Laura", "Marketing", 10000);
        Employee marketing2 = new Employee("Bob", "Marketing", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(sale1);
        headSales.add(sale2);

        headMarketing.add(marketing1);
        headMarketing.add(marketing2);

        System.out.println(CEO);

        for(Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for(Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
