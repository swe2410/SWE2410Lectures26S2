/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week3.cohesion;

import java.util.Scanner;
import java.util.function.Consumer;

public class LogicalCohesion {
    private static class FormatUpper implements Consumer<String>{
        @Override
        public void accept(String s) {
            System.out.println(s.toUpperCase());
        }
    }
    private static class FormatColor implements Consumer<String>{
        @Override
        public void accept(String s) {
            System.out.println("\u001B[31m" + s + "\u001B[0m");
        }
    }
    private static class FormatUnder implements Consumer<String>{
        @Override
        public void accept(String s) {
            System.out.println("_"+s+"_");
        }
    }

    public static void printMsg(String msg, String format){
        if(format.equals("caps")){
            System.out.println(msg.toUpperCase());
        } else if(format.equals("red")){
            System.out.println("\u001B[31m" + msg + "\u001B[0m");
        } else if(format.equals("under")){
            System.out.println("_"+msg+"_");
        }
    }
    private static void printMsgs2(String msg, Consumer<String> formatter){
        formatter.accept(msg);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = "Hello World";
        System.out.println("How do you want to format the output?");
        System.out.println("1.All caps\n2.In Red\n3.With underscores");
        String option = scanner.nextLine();
        if(option.equals("1")){
            //printMsg("Hello world", "caps");
            printMsgs2(msg, new FormatUpper());
        } else if (option.equals("2")) {
            //printMsg(msg, "red");
            printMsgs2(msg, new FormatColor());
        } else if (option.equals("3")){
            //printMsg(msg, "under");
            printMsgs2(msg, new FormatUnder());
        }
    }
}
