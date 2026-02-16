/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/12/2026
 */

package week3.cohesion;

public class TemporalCohesion1After {
    private final ConfigLoader configLoader = new ConfigLoader();
    private final Database database = new Database();
    private final AppLogger logger = new AppLogger();
    private final Cache cache = new Cache();

    private void initialize() {
        configLoader.load();
        database.connect();
        logger.initialize();
        cache.preload();
    }

    // ---- Inner classes ----

    private class ConfigLoader {
        private void load() {
            System.out.println("Configuration loaded");
        }
    }

    private class Database {
        private void connect() {
            System.out.println("Database connected");
        }
    }

    private class AppLogger {
        private void initialize() {
            System.out.println("Logger initialized");
        }
    }

    private class Cache {
        private void preload() {
            System.out.println("Cache preloaded");
        }
    }

    // Optional: entry point for testing
    public static void main(String[] args) {
        TemporalCohesion1Before app = new TemporalCohesion1Before();
        app.initialize();
    }
}
