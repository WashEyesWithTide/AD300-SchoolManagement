import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School("Test High School");
        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(new Department("Science"));
        departments.add(new Department("English"));
        school.addDepartment(departments);

        ArrayList<Teacher> scienceTeachers = new ArrayList<Teacher>();
        scienceTeachers.add(new Teacher("Alice", "Physics"));
        scienceTeachers.add(new Teacher("Charlie", "Chemistry"));
        school.getDepartments().get(0).addTeacher(scienceTeachers);
        ArrayList<Student> scienceStudents = new ArrayList<Student>();
        scienceStudents.add(new Student("Bob", 10));
        scienceStudents.add(new Student("Dave", 9));
        scienceStudents.add(new Student("Eve", 11));
        school.getDepartments().get(0).addStudent(scienceStudents);
        ArrayList<Teacher> englishTeachers = new ArrayList<Teacher>();
        englishTeachers.add(new Teacher("Eve", "Literature"));
        englishTeachers.add(new Teacher("Grace", "Writing"));
        school.getDepartments().get(1).addTeacher(englishTeachers);
        ArrayList<Student> englishStudents = new ArrayList<Student>();
        englishStudents.add(new Student("Frank", 8));
        englishStudents.add(new Student("Heidi", 9));
        englishStudents.add(new Student("Ivan", 10));
        school.getDepartments().get(1).addStudent(englishStudents);
        school.displayInfo();

    }
}