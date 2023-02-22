package lab_07;

public class ContractEmployee extends Employee {

    public ContractEmployee(String employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    @Override
    public int getSalary() {
        return 40000;
    }
}
