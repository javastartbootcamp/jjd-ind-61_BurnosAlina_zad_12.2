import java.io.*;

public class EmployeeReader {

    Employee[] readAndCreateEmployees(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int linesNumber = countLines(fileName);
        Employee[] employees = new Employee[linesNumber];
        for (int i = 0; i < linesNumber; i++) {
            String line = reader.readLine();
            String[] employeeData = line.split(";");
            String firstName = employeeData[0];
            String lastName = employeeData[1];
            String pesel = employeeData[2];
            String department = employeeData[3];
            double salary = Double.parseDouble(employeeData[4]);
            employees[i] = new Employee(firstName, lastName, pesel, department, salary);
        }
        return employees;
    }

    private int countLines(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int counter = 0;
        while (reader.readLine() != null) {
            counter++;
        }

        return counter;
    }
}
