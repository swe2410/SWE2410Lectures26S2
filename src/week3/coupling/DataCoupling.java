/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

import java.util.Arrays;
import java.util.List;

public class DataCoupling {
    private static int add(int a, int b) {
        return a + b;
    }

    private record Point(int x, int y) {
    }
    double distance(Point p1, Point p2) {
        return Math.hypot(p1.x() - p2.x(), p1.y() - p2.y());
    }
    private static double sumSquareValues(List<Integer> list){
        double sum = 0;
        for(Integer i: list){
            sum += Math.pow(i,2);
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println(sumSquareValues(nums));
    }
}
