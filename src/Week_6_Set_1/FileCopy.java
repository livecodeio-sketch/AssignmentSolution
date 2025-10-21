package Week_6_Set_1;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully from " + inputFile + " to " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
