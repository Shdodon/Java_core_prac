package lesson3;
/*
Создать класс "Сотрудник" с полями: ФИО, должность, телефон,
зарплата, возраст;
 */
public class Employee {
    private static final int CURRENT_YEAR = 2024;
    private String firstName;
    private String secondName;

    private String surName;

    private String positionOrg;

    private String phone;

    private Integer salary;

    private Integer birthDay;

    public Employee(String firstName, String secondName, String surName, String positionOrg, String phone, Integer salary, Integer birthDay){
        this.firstName = firstName;
        this.secondName = secondName;
        this.surName = surName;
        this.positionOrg = positionOrg;
        this.phone = phone;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPositionOrg() {
        return positionOrg;
    }

    public void setPositionOrg(String positionOrg) {
        this.positionOrg = positionOrg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return CURRENT_YEAR - birthDay;
    }

    public void setAge(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public void increaseSalary(Integer amount) {
        salary += amount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surName='" + surName + '\'' +
                ", positionOrg='" + positionOrg + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + birthDay +
                '}';
    }

}
