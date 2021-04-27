/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author quach
 */
abstract class People {

    private Integer id;
    private String name;
    protected String job;

    public abstract void show();

    public People() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}

class Student extends People {

    public Student() {
        job = "Student";
    }

    @Override
    public void show() {
        System.out.println("I'm a " + job);
    }
}

class Employee extends People {

    public Employee() {
        job = "employee";
    }

    @Override
    public void show() {
        System.out.println("I'm a " + job);
    }

}

class ListPeople {

    private static HashMap<Integer, People> hash = new HashMap<>();

    public void addPeople() {
        Student student = new Student();
        student.setId(1);
        student.setName("Quach Hong Thu");
        hash.put(student.getId(), student);

        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("Vo Thi Hong Nhun");
        hash.put(employee.getId(), employee);
    }

    public void show() {
        for (Map.Entry<Integer, People> entry : hash.entrySet()) {
            Integer key = entry.getKey();
            People value = entry.getValue();
            System.out.println("ID: " + key);
            System.out.println("Name: " + value.getName());
            System.out.println("Job: " + value.getJob());
        }
    }
}

public class Prototype {

    public static void main(String[] args) {
        ListPeople list = new ListPeople();
        list.addPeople();
        list.show();
    }

}
