package lab_07;

import java.util.Arrays;
import java.util.List;

public class CalculateTotalSalary {

    public static void main(String[] args) {
        CalculateTotalSalary calculateTotalSalary = new CalculateTotalSalary();
        Employee employee1 = new FullTimeEmployee("001", "Thao");
        Employee employee2 = new FullTimeEmployee("002", "Tin");
        Employee employee3 = new FullTimeEmployee("003", "Hien");
        Employee employee4 = new ContractEmployee("004", "Vu");
        Employee employee5 = new ContractEmployee("005", "Thi");
        calculateTotalSalary.salaryCalculate(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
    }

    public void salaryCalculate(List<Employee> employeeList) {
        int salary = 0;
        for (int index = 0; index < employeeList.size(); index++) {
            salary = salary + employeeList.get(index).getSalary();
        }
        System.out.println(salary);
    }

}

