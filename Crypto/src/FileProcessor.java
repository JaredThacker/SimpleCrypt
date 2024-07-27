import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {

    public static class LineProcessor {
        public String processLine(String line) {
            return line;
        }
    }

    public static void main(String[] args) {
        ROT13 rot13 = new ROT13();
        String inputFilePath = "sonnet18.txt";
        String outputFilePath = "sonnet18.enc";
        LineProcessor processor = new LineProcessor();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = processor.processLine(line);
                processedLine = rot13.crypt(processedLine);
                writer.write(processedLine);
                writer.newLine();
            }
        } catch (IOException e) {System.out.println("File not found");}
    }
}

