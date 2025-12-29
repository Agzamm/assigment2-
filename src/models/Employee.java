package models;

public class Employee {
    private static int id_gen = 1;
    private final int id;
    private String name;
    private String surname;
    private double salary;

    public Employee(){
        id = id_gen++ ;
    }

    public Employee(String name, String surname, double salary){
        this();
        setName(name);
        setSurname(surname);
        setSalary(salary);
    }

    public getId(){
        return id;
    }

    public getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public getSalaty(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
