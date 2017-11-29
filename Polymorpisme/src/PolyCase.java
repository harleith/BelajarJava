
import java.util.ArrayList;

public class PolyCase {
    public static void main(String[] args) {

        Employee jack = new Employee("Jack");
        Employee doel = new Programmer();
        doel.setName("doel");
        Employee udin = new Developer();
        udin.setName("Udin");
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(doel);
        employees.add(udin);
        
        for (Employee employee : employees) {
            if (employee instanceof Programmer) { // instanceof berguna untuk 
                Programmer p = (Programmer) employee;
                System.out.println("nama Programmer: "+ p.getName());
                p.coding();
            } else {
                System.out.println("Nama EmployeeL "+ employee.getName());
            }
        }

    }
    
}
