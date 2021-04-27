/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quach
 */
interface People {

    public String id();

    public String name();

    public Student student();

    public Integer age();
}

interface Student {

    public String gender();
}

class Female implements Student {

    @Override
    public String gender() {
        return "female";
    }
}

class Male implements Student {

    @Override
    public String gender() {
        return "male";
    }
}

abstract class firstStudent implements People {

    @Override
    public Student student() {
        return new Female();
    }

    public abstract Integer age();
}

abstract class secondStudent implements People {

    @Override
    public Student student() {
        return new Male();
    }

    public abstract Integer age();
}

class AgeofFirstStudent extends firstStudent {

    @Override
    public String id() {
        return "1";
    }

    @Override
    public String name() {
        return "Quach Hong Thu";
    }

    @Override
    public Integer age() {
        return 20;
    }
}

class AgeofSecondStudent extends firstStudent {

    @Override
    public String id() {
        return "2";
    }

    @Override
    public String name() {
        return "Vo Thi Hong Nhun";
    }

    @Override
    public Integer age() {
        return 20;
    }
}

class ListStudent {

    private List<People> people = new ArrayList<People>();

    public void addPeople(People p) {
        people.add(p);
    }

    public void show() {
        for (People p : people) {
            System.out.println("ID: " + p.id());
            System.out.println("Name: " + p.name());
            System.out.println("Age: " + p.age());
            System.out.println("Gender: " + p.student().gender());
        }
    }
}

public class BuilderPattern {

    public static void main(String[] args) {

        ListStudent list = new ListStudent();
        People p;

        list.addPeople(new AgeofFirstStudent());
        list.addPeople(new AgeofSecondStudent());
        list.show();
    }

}
