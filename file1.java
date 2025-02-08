import java.io.*;

public class file1{
    public static void main(String[] args) {
        String filename = "Task1.txt";
        String content = "==============================\n"
                       + " Welcome to Code Tech Solutions Internship! \n"
                       + "==============================\n"
                       + "This program demonstrates file handling in Java.\n";
        
        writeFile(filename, content);
        appendToFile(filename, "\n----------------------------------------\n");
        appendToFile(filename, "Code Tech Solutions provides hands-on experience in software development.\n");
        appendToFile(filename, "Join  to enhance your programming skills and industry knowledge!\n");
        appendToFile(filename, "----------------------------------------\n");
        readFile(filename);
    }

    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println(" File written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void appendToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
            System.out.println(" Content appended successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println(" Content in File:");
            System.out.println("----------------------------------------");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("----------------------------------------");
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
