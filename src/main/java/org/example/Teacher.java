package org.example;

public class Teacher implements Component{
    private String name;

    public Teacher(String name) {
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
