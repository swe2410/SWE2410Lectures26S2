package strategy.ducksimv3;

import week2.strategy.ducksimv3.behaviors.*;

public class DuckSimulator {
    public static void main(String[] args) {
//        //Program to the interface, not the implementation
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        Duck redHeadDuck = new RedHeadDuck(new FlyWithWings(), new Quack());
        Duck rubberDuck = new RubberDuck(new NoFly(), new Squeak());
        Duck decoyDuck = new DecoyDuck(new NoFly(), new MuteQuack());

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.quack();
//        System.out.println();

//        rubberDuck.display();
//        rubberDuck.swim();
//        rubberDuck.fly();
//        rubberDuck.quack();
//        System.out.println();

//        decoyDuck.display();
//        decoyDuck.swim();
//        decoyDuck.fly();
//        decoyDuck.quack();



//
//        List<Duck> duckList = new ArrayList<>();
//        duckList.add(mallardDuck);
//        duckList.add(redheadDuck);
//        duckList.add(rubberDuck);
//        duckList.add(decoyDuck);
//
//        for(Duck d: duckList){
//            d.display();
//            d.quack();
//            d.swim();
//            d.fly();
//            System.out.println();
//        }


    }
}
