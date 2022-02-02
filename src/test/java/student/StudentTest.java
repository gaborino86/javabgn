package student;

import course.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testGetName() {
        //Given - Példányosítás
        Student student = new Student("Béla");
        //When - Változó
        String result = student.getName();
        //Then - Egyenlőség vizsgálata
        assertEquals("Béla", result);
        //Egyszerübben
  //      assertEquals("Béla", student.getName());
    }

}
