import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public List<Teacher> teachers = new ArrayList<>();
    public List<Student> students = new ArrayList<>();

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
}
