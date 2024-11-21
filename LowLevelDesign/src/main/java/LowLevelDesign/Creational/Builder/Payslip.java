import java.io.FileWriter;
import java.io.IOException;

public class Payslip {
    private String employeeName;
    private String employeeId;
    private double basicSalary;
    private double allowances;
    private double deductions;
    private double netSalary;

    // Private constructor
    private Payslip(PayslipBuilder builder) {
        this.employeeName = builder.employeeName;
        this.employeeId = builder.employeeId;
        this.basicSalary = builder.basicSalary;
        this.allowances = builder.allowances;
        this.deductions = builder.deductions;
        this.netSalary = builder.netSalary;
    }

    // Method to write the payslip to a file
    public void writeToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Payslip\n");
            writer.write("========================\n");
            writer.write("Employee Name: " + employeeName + "\n");
            writer.write("Employee ID: " + employeeId + "\n");
            writer.write("Basic Salary: " + basicSalary + "\n");
            writer.write("Allowances: " + allowances + "\n");
            writer.write("Deductions: " + deductions + "\n");
            writer.write("Net Salary: " + netSalary + "\n");
            writer.write("========================\n");
            System.out.println("Payslip generated at: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing payslip to file: " + e.getMessage());
        }
    }

    // Static Builder class
    public static class PayslipBuilder {
        private String employeeName;
        private String employeeId;
        private double basicSalary;
        private double allowances;
        private double deductions;
        private double netSalary;

        public PayslipBuilder setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public PayslipBuilder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public PayslipBuilder setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
            return this;
        }

        public PayslipBuilder setAllowances(double allowances) {
            this.allowances = allowances;
            return this;
        }

        public PayslipBuilder setDeductions(double deductions) {
            this.deductions = deductions;
            return this;
        }

        public PayslipBuilder calculateNetSalary() {
            this.netSalary = this.basicSalary + this.allowances - this.deductions;
            return this;
        }

        public Payslip build() {
            return new Payslip(this);
        }
    }
}
