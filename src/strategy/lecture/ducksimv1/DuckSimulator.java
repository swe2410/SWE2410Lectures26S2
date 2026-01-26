package strategy.lecture.ducksimv1;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {

        List<Duck> duckList = new ArrayList<>();
        duckList.add(new Duck("MallardDuck"));
        duckList.add(new Duck("RubberDuck"));
        duckList.add(new Duck("RedHeadDuck"));

        for(Duck d: duckList){
            d.display();
            d.quack();
            d.swim();
            System.out.println();
        }
    }
}
