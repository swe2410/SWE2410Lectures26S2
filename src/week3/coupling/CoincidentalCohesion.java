/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

import java.util.Scanner;

public class CoincidentalCohesion {
    private class Utils {
        private static void printHeader() {
            System.out.println("printing header");
        }
        private static int calculateScore(int a, int b) {
            return 0;
        }
        private static boolean isValidEmail(String email) {
            return false;
        }
        private static void saveToFile(String data) {
            System.out.println("saving to file");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Invalid input");
        }

        int result = x * 42;

        saveToDatabase(result);
        sendEmail(result);
    }
    private static void sendEmail(int result){
    }
    private static void saveToDatabase(int result) {
    }
}
