import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeStatsWriter {

    void write(String fileName, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.close();
    }
}
