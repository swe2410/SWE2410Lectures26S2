package week5.prep.icecream.badversion;

/**
 * Interface that represents a concreate confection
 * such as a cone or dish, but also decorators
 * like sprinkles or fudge
 */
public abstract class IceCreamProduct {
    private boolean hasFudge;
    private boolean hasSprinkles;
    private boolean hasPeanuts;

    public void addFudge() {
        this.hasFudge = true;
    }
    public void addSprinkles() {
        this.hasSprinkles = true;
    }
    public void addPeanuts(){
        this.hasPeanuts = true;
    }
    public boolean hasFudge() {
        return hasFudge;
    }
    public boolean hasPeanuts() {
        return hasPeanuts;
    }
    public boolean hasSprinkles() {
        return hasSprinkles;
    }
    /**
     * Returns the cost of the item
     * @return Cost of the item
     */
    public double cost(){
        double ret = 0;
        if(hasFudge){
            ret += 0.5;
        }
        if(hasSprinkles){
            ret += 0.1;
        }
        if(hasPeanuts){
            ret += 0.2;
        }
        return ret;
    }
    /**
     * Returns a description of the item
     * @return Description of the item
     */
    public String description(){
        StringBuilder sb = new StringBuilder();
        if(hasFudge){
            sb.append("Fudge ");
        }
        if(hasSprinkles){
            sb.append("Sprinkles ");
        }
        if(hasPeanuts){
            sb.append("Peanuts ");
        }
        return sb.toString();
    }
}
