package lab_07;

public class Employee {

    private String employeeId;
    private String employeeName;

    private int salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return this.salary;
    }

}
