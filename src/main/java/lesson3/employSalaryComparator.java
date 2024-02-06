package lesson3;

import java.util.Comparator;

/*
Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.
 */
public class employSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee0, Employee employee1) {
        double salary1 = employee0.getSalary();
        double salary2 = employee1.getSalary();
        if (salary1 < salary2) {
            return -1;
        } else if (salary1 > salary2) {
            return 1;
        } else {
            return 0;
        }
    }


}
