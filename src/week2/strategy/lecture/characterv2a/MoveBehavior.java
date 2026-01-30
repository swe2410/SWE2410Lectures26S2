package week2.strategy.lecture.characterv2a;

public abstract class MoveBehavior {
    protected Character character;
    public MoveBehavior(){

    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public abstract void move(String direction);
}
