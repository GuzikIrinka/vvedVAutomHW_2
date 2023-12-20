import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ComponentTest {
    static Component student;
    static Component teacher;
    static Group group;
    static  Group classA;

    @BeforeAll
    static void init() {
        student = new Student("Лев");
        teacher = new Teacher("Сергей Стефанович");
        group = new Group("Подгруппа");
        classA = new Group("Класс А");
        group.addComponent(student);
        classA.addComponent(teacher);
        classA.addComponent(group);
    }

    @Test
    void testGetCountPeopleTeacher() {
        Assertions.assertEquals(1, teacher.getCountPeople());
    }

    @Test
    void testGetCountPeopleStudent() {
        Assertions.assertEquals(1, student.getCountPeople());
    }

    @Test
    void testGetCountPeopleClass() {
        Assertions.assertEquals(2, classA.getCountPeople());
    }
}
