package helloDb;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("C:\\Users\\cnit\\OneDrive\\Desktop\\JAVA\\helloDb\\invoice.txt")) {
            writer.write("Invoice No: 1001\n");
            writer.write("Customer: Mohan\n");
            writer.write("Amount: $500.00\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
