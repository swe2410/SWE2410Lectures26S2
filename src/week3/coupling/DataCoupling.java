/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

import java.util.List;

public class DataCoupling {
    private static int add(int a, int b) {
        return a + b;
    }
    private double sumSquareValues(List<Integer> list){
        double sum = 0;
        for(Integer i: list){
            sum += Math.pow(i,2);
        }
        return sum;
    }
    private record Point(int x, int y) {
    }
    double distance(Point p1, Point p2) {
        return Math.hypot(p1.x() - p2.x(), p1.y() - p2.y());
    }
}
