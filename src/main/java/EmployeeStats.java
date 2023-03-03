public class EmployeeStats {

    double calculateAvgSalary(Employee[] employees) {
        double salariesSum = 0;
        for (Employee employee : employees) {
            salariesSum += employee.getSalary();
        }
        return salariesSum / employees.length;
    }

    double findTheHighestSalary(Employee[] employees) {
        double theHighestSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > theHighestSalary) {
                theHighestSalary = employee.getSalary();
            }
        }
        return theHighestSalary;
    }

    double findTheLowestSalary(Employee[] employees) {
        double theLowestSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < theLowestSalary) {
                theLowestSalary = employee.getSalary();
            }
        }
        return theLowestSalary;
    }

    int calculateEmployeeNumberForDepartment(Employee[] employees, String department) {
        int employeeCounter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }
}
