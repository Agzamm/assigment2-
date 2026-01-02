package models;

import java.io.File;
import java.util.Scanner;

public class Student implements Comparable<Student>{
    private static int id_gen = 1;
    private final int id;
    private String name;
    private String surname;
    private double gpa;

    public Student(){
        id = id_gen++ ;
    }

    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);

    }

    public int gerId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGpa{
        return gpa ;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa ;
    }

    @Override
    public int compareTo(Student antoherStudent){
        if (gpa > antoherStudent.gpa){
            return 1;
        }
        if (gpa < antoherStudent.gpa){
            return -1;
        }

        return 0;
    }

    interface double getPaymentAmount() throws Exception {
        File file = new File("/home/weltom/IdeaProjects/assigment2/src/Students");
        Scanner scanner = new Scanner(file);

        double degree = 36660.00;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String[] name = parts;
            String[] surname = parts;
            double gpa = Double.parseDouble(parts);

            if (gpa > 2.67) {

            }
        }
    }
        return 0;

    @Override
    public String toString(){
        return id + " " + name + " " + surname + ": " + gpa;
    }

    }
