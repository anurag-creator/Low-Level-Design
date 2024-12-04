package LowLevelDesign.Structural.Composite;

public class SingleDepartment implements Department{
    private String name;
    private int employeeCount;

    public SingleDepartment(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    @Override
    public void showDepartmentDetails() {
        System.out.println("Department: " + name + ", Employees: " + employeeCount);
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }
}
