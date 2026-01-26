package strategy.lecture.ducksimv2a;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> duckList = new ArrayList<>();
        duckList.add(new MallardDuck());
        duckList.add(new RubberDuck());
        duckList.add(new RedheadDuck());

        for(Duck d: duckList){
            d.display();
            d.quack();
            d.swim();
            System.out.println();
        }

//        Duck mallardDuck = new MallardDuck();
//        Duck redheadDuck = new RubberDuck();
//        Duck rubberDuck = new RedHeadDuck();

//        mallardDuck.display();
//        mallardDuck.quack();
//        mallardDuck.swim();
//
//        rubberDuck.display();
//        rubberDuck.quack();
//        rubberDuck.swim();


    }
}
