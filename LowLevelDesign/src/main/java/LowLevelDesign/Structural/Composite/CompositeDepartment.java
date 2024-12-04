package LowLevelDesign.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDepartment implements Department {
    private String name;
    private List<Department> subDepartments = new ArrayList<>();

    public CompositeDepartment(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        subDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        subDepartments.remove(department);
    }

    @Override
    public void showDepartmentDetails() {
        System.out.println("Composite Department: " + name);
        for (Department department : subDepartments) {
            department.showDepartmentDetails();
        }
    }

    @Override
    public int getEmployeeCount() {
        int totalEmployees = 0;
        for (Department department : subDepartments) {
            totalEmployees += department.getEmployeeCount();
        }
        return totalEmployees;
    }
}
