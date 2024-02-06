package lesson3;

/*
 Опишите класс руководителя, наследник от сотрудника.
 */
public class Supervisor extends Employee{
    public Supervisor(String firstName, String secondName, String sureName, String positionOrg, String phone, Integer salary,Integer birthDay){
        super(firstName, secondName, sureName, positionOrg, phone, salary, birthDay);
    }

}
