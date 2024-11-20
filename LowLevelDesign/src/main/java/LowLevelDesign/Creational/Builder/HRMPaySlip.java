package LowLevelDesign.Creational.Builder;

public class HRMPaySlip {
    public static void main(String[] args) {
        // Create a payslip for an employee using the Builder
        Payslip payslip = new Payslip.PayslipBuilder()
                .setEmployeeName("John Doe")
                .setEmployeeId("EMP123")
                .setBasicSalary(50000)
                .setAllowances(10000)
                .setDeductions(5000)
                .calculateNetSalary() // Automatically calculates net salary
                .build();

        // Write the payslip to a file
        payslip.writeToFile("payslip.txt");
}
