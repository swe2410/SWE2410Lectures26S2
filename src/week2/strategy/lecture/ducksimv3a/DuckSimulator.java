package week2.strategy.lecture.ducksimv3a;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> duckList = new ArrayList<>();
        duckList.add(new MallardDuck(new FlyWithWings()));
        duckList.add(new RubberDuck(new FlyWithWings()));
        duckList.add(new RedheadDuck(new FlyWithWings()));

        for(Duck d: duckList){
            d.display();
            d.quack();
            d.swim();
            d.fly();
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
