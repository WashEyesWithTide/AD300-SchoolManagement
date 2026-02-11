import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Department> departments = new ArrayList<>();
    private String name;

    public School(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }
    public void addDepartment(List<Department> dept) {
        this.departments.addAll(dept);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("School: " + name);
        System.out.println(" Departments: ");
        for (Department dept : departments) {
            dept.displayInfo();
        }
    }
}