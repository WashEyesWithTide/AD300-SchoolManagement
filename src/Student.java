public class Student {
    public String name;
    public int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void displayInfo() {
        System.out.println("    Name: " + name + ", Grade: " + grade);
    }
}
