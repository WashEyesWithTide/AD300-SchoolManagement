import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addTeacher(List<Teacher> teacher) {
        this.teachers.addAll(teacher);
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addStudent(List<Student> student) {
        this.students.addAll(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public List<Student> getStudents() {
        return students;
    }
    public String getName() {
        return name;
    }
    public void displayInfo() {
        System.out.println("  " + name);
        System.out.println("   Teachers:");
        for (Teacher teacher : teachers) {
            teacher.displayInfo();
        }
        System.out.println("   Students:");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}