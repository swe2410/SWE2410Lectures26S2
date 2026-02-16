/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week3.cohesion;

public class ProceduralCohesion {
    private class FileImporter {
        public void importFile(String path) {
            openFile(path);
            parseFile();
            validateRecords();
            saveToDatabase();
            closeFile();
        }
        public void openFile(String path) { }
        public void parseFile() { }
        public void validateRecords() { }
        public void saveToDatabase() { }
        public void closeFile() { }
    }

}
