package org.example;

public class Student implements Component{
    private String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println(this.getClass().getName().substring(4) + " " + name);
    }

    @Override
    public int getCountPeople() {
        return 1;
    }
}
