package LowLevelDesign.Creational.Builder;

import java.io.FileWriter;
import java.io.IOException;

public class Payslip {
    private String employeeName;
    private String employeeId;
    private double basicSalary;
    private double allowances;
    private double deductions;
    private double netSalary;

    private Payslip(PayslipBuilder builder) {
        this.employeeName = builder.employeeName;
        this.employeeId = builder.employeeId;
        this.basicSalary = builder.basicSalary;
        this.allowances = builder.allowances;
        this.deductions = builder.deductions;
        this.netSalary = builder.netSalary;
    }
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
}
