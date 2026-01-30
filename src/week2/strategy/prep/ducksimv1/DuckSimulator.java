package week2.strategy.prep.ducksimv1;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new Duck("MallardDuck");
        Duck redheadDuck = new Duck("RedHeadDuck");
        Duck rubberDuck = new Duck("RubberDuck");

        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();

        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
    }
}
