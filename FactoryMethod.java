/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopattern;

/**
 *
 * @author quach
 */
interface People {

    public void show();
}

class Student implements People {

    @Override
    public void show() {
        System.out.println("I'm a student.");
    }
}

class Employee implements People {

    @Override
    public void show() {
        System.out.println("I'm a employee.");
    }
}

public class FactoryMethod {

    People getInfor(String inp) {
        if (null == inp) {
            return null;
        } else {
            switch (inp) {
                case "student":
                    return new Student();
                case "employee":
                    return new Employee();
                default:
                    break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        People p1 = factoryMethod.getInfor("student");
        p1.show();

        People p2 = factoryMethod.getInfor("employee");
        p2.show();
    }

}
