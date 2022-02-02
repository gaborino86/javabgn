package course;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String title;
    private int length;
//Student elemeket tatalmazó lista
    private List<Student> students = new ArrayList<>();

    public Course(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
//Lista lekérése
    public List<Student> getStudents() {
        return students;
    }
//Hallgatók hozzáadása
    public void addStudent(Student student) {
        students.add(student);
    }

    public static void main(String[] args) {
        Course course = new Course("Matematikai alapok", 30);
        System.out.println(course.getStudents());

        course.addStudent(new Student("John"));
        course.addStudent(new Student("Béla"));

        System.out.println(course.getStudents());
        System.out.println(course.getStudents().get(0));
        System.out.println(course.getStudents().get(0).getName());
        System.out.println(course.getStudents().get(1).getName());
    }
}
