package strategy.ducksimv2;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        //Program to the interface, not the implementation
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

        List<Duck> duckList = new ArrayList<>();
        duckList.add(new MallardDuck());
        duckList.add(new RubberDuck());
        duckList.add(new RedheadDuck());

        for(Duck d: duckList){
            d.display();
            d.quack();
            d.swim();
            d.fly();
            System.out.println();
        }
    }
}
