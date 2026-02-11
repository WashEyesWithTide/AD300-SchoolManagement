public class Main {
    public static void main(String[] args) {
        School school = new School("Test High School");
        school.addDepartment(new Department("Science"));
        school.addDepartment(new Department("English"));
        school.getDepartments().get(0).addTeacher(new Teacher("Alice", "Physics"));
        school.getDepartments().get(0).addTeacher(new Teacher("Charlie", "Chemistry"));
        school.getDepartments().get(0).addStudent(new Student("Bob", 10));
        school.getDepartments().get(0).addStudent(new Student("Dave", 9));
        school.getDepartments().get(0).addStudent(new Student("Eve", 11));
        school.getDepartments().get(1).addTeacher(new Teacher("Eve", "Literature"));
        school.getDepartments().get(1).addTeacher(new Teacher("Grace", "Writing"));
        school.getDepartments().get(1).addStudent(new Student("Frank", 8));
        school.getDepartments().get(1).addStudent(new Student("Heidi", 9));
        school.getDepartments().get(1).addStudent(new Student("Ivan", 10));
        school.displayInfo();

    }
}