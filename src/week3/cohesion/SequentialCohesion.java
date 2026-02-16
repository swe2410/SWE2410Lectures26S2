/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week3.cohesion;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SequentialCohesion {
    private static class FileProcessor {
        public void process() throws IOException {
            String filename = askForFilename();
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            Files.writeString(filePath, String.join("\n", lines));
        }
        private String askForFilename() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter input filename: ");
            return scanner.nextLine();
        }
    }
    public static void main(String[] args) throws IOException {
        new FileProcessor().process();
    }
}

