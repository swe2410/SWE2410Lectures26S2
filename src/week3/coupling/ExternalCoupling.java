/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/8/2026
 */

package week3.coupling;

import java.io.IOException;

public class ExternalCoupling {
    class FileOpener {
        void open(String file) throws IOException {
            Runtime.getRuntime().exec("notepad.exe " + file);
        }
    }

    public static void main(String[] args) {
        String path = System.getenv("APP_HOME");
        //SerialPort port = SerialPort.getCommPort("COM3");
    }
}
