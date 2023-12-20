package org.example;

public class Main {
    public static void main(String[] args) {
        Component student1 = new Student("Матвей");
        Component student2 = new Student("Илья");
        Component student3 = new Student("Ольга");

        Component student4 = new Student("Екатерина");
        Component student5 = new Student("Марина");
        Component student6 = new Student("Олег");

        Component teacher1 = new Teacher("Мария Сергеевна");
        Component teacher2 = new Teacher("Наталья Александровна");
        Component teacher3 = new Teacher("Игорь Петрович");

        Group group1 = new Group("Класс 5");
        Group group2 = new Group("Класс 6");
        Group classA = new Group("Буква В");

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
