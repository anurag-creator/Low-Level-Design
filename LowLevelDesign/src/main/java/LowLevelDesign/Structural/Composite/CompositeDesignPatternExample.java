package LowLevelDesign.Structural.Composite;

public class CompositeDesignPatternExample {
    public static void main(String[] args) {
        // Leaf Departments
        Department hr = new SingleDepartment("HR", 150);
        Department finance = new SingleDepartment("Finance", 100);
        Department engineering = new SingleDepartment("Engineering", 50);

        // Composite Department
        CompositeDepartment headOffice = new CompositeDepartment("Head Office");

        // Add leaf departments 
        headOffice.addDepartment(hr);
        headOffice.addDepartment(finance);

        // Another Composite Department
        CompositeDepartment regionalOffice = new CompositeDepartment("Regional Office");
        regionalOffice.addDepartment(engineering);

        // Add regional office to the head office
        headOffice.addDepartment(regionalOffice);


        System.out.println("Company Departments Details :");
        headOffice.showDepartmentDetails();

        // Get total employees
        System.out.println("Total Employees in the Company: " + headOffice.getEmployeeCount());
    }
}
