package LowLevelDesign.Creational.Builder;

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
