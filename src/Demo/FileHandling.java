package Demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\code io\\IdeaProjects\\AssignmentSolution\\src\\Demo\\file.txt");

        FileWriter fileWriter = new FileWriter("output.txt");
        //fileWriter.write("\nThis is Output file");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            // System.out.println(scanner.nextLine());
            fileWriter.write(scanner.nextLine()+"\n");
        }

        scanner.close();
        fileWriter.close();
    }
}
