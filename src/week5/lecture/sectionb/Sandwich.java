/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.sectionb;

/**
 * Represents a sandwich with a size
 */
public abstract class Sandwich {
    protected final String size;

    /**
     * Creates a new sandwich of the given size.
     * @param size Size of the sandwich: large or normal
     */
    public Sandwich(String size) {
        this.size = size;
    }

    /**
     * Returns the cost of the sandwich. This
     * method will be decorated.
     * @return Cost of the sandwich, which depends
     * on the size and extras.
     */
    public abstract double getCost();

    /**
     * Returns the description of the sandwich. This
     * method will be decorated.
     * @return Name of the sandwich, which can be
     * modified by the size and extras.
     */
    public abstract String getDescription();

    /**
     * Returns the size (large or normal) of
     * the sandwich.
     * @return Size of the sandwich
     */
    public String getSize() {
        return size;
    }
}
