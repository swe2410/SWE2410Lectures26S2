/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week3.cohesion;

public class TemporalCohesion1Before {
    public void initialize() {
        loadConfiguration();
        connectToDatabase();
        initializeLogger();
        preloadCache();
    }
    private void preloadCache() {
        System.out.println("Preloading the cache");
    }
    private void initializeLogger() {
        System.out.println("Initializing the logger");
    }

    private void connectToDatabase() {
        System.out.println("Connection to the database");
    }
    private void loadConfiguration() {
        System.out.println("Loading configuration");
    }
}

