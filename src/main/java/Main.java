import java.io.File;
import java.io.IOException;

public class Main {

    static final String DEPARTMENT_IT = "IT";
    static final String DEPARTMENT_SUPPORT = "Support";
    static final String DEPARTMENT_MANAGEMENT = "Management";

    public static void main(String[] args) throws IOException {

        EmployeeReader reader = new EmployeeReader();
        EmployeeStats statistics = new EmployeeStats();
        String fileName = "employees.csv";
        File file = new File(fileName);
        Employee[] employees = reader.readAndCreateEmployees(fileName);

        double avgSalary = statistics.calculateAvgSalary(employees);
        double theHighestSalary = statistics.findTheHighestSalary(employees);
        double theLowestSalary = statistics.findTheLowestSalary(employees);
        int employeeNumberForItDepartment =
                statistics.calculateEmployeeNumberForDepartment(employees, DEPARTMENT_IT);
        int employeeNumberForSupportDepartment =
                statistics.calculateEmployeeNumberForDepartment(employees, DEPARTMENT_SUPPORT);
        int employeeNumberForManagementDepartment =
                statistics.calculateEmployeeNumberForDepartment(employees, DEPARTMENT_MANAGEMENT);

        String text = "Średnia wypłata: " + avgSalary + "\n" +
                "Minimalna wypłata: " + theLowestSalary + "\n" +
                "Maksymalna wypłata: " + theHighestSalary + "\n" +
                "Liczba pracowników IT: " + employeeNumberForItDepartment + "\n" +
                "Liczba pracowników Support: " + employeeNumberForSupportDepartment + "\n" +
                "Liczba pracowników Management: " + employeeNumberForManagementDepartment;

        if (file.exists()) {
            String fileName1 = "stats.txt";
            EmployeeStatsWriter writer = new EmployeeStatsWriter();
            writer.write(fileName1, text);
        }
    }
}
