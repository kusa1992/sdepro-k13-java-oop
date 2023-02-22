package lab_07;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    @Override
    public int getSalary() {
        return 50000;
    }
}
