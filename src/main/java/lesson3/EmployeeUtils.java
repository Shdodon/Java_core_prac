package lesson3;

public class EmployeeUtils {

    public void salaryUp(Employee[] employees) {

        for (Employee employee : employees) {
            if(employee.getAge() > 45) employee.setSalary(employee.getSalary() + 5000);
//45^42
        }
    }
}
