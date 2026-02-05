import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Department> departments = new ArrayList<>();
    public String name;

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
