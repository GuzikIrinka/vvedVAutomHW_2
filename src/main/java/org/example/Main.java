package org.example;

public class Main {
    public static void main(String[] args) {
        Component student1 = new Student("Иван");
        Component student2 = new Student("Илья");
        Component student3 = new Student("Игорь");

        Component student4 = new Student("Ольга");
        Component student5 = new Student("Оксана");
        Component student6 = new Student("Оскар");

        Component teacher1 = new Teacher("Светлана Анатольена");
        Component teacher2 = new Teacher("Сергей Стефанович");
        Component teacher3 = new Teacher("Георгий Николаевич");

        Group group1 = new Group("Подгруппа 1");
        Group group2 = new Group("Подгруппа 2");
        Group classA = new Group("Класс А");

        group1.addComponent(teacher1);
        group1.addComponent(student1);
        group1.addComponent(student2);
        group1.addComponent(student3);

        group2.addComponent(teacher2);
        group2.addComponent(student4);
        group2.addComponent(student5);
        group2.addComponent(student6);

        classA.addComponent(teacher3);
        classA.addComponent(group1);
        classA.addComponent(group2);

        classA.print();
        System.out.printf("Общее количество человек в классе: %d", classA.getCountPeople());
    }
}
