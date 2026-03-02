/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/2/2026
 */

package week7.trainv2;

import java.util.Random;

public class Train {
    private static final String[] LOCATIONS = {
            "Chicago", "Milwaukee", "Madison", "Detroit", "Minneapolis"
    };
    private static final Random random = new Random();
    private String trainId;
    private String sourceLocation;
    private int platformNumber;
    public Train() {
        this.trainId = "TR - " + (random.nextInt(9000) + 1000);
        this.sourceLocation = LOCATIONS[random.nextInt(LOCATIONS.length)];
        this.platformNumber = random.nextInt(5) + 1; // platforms 1–5
    }
    public String getTrainId() {
        return trainId;
    }
    public String getSourceLocation() {
        return sourceLocation;
    }
    public int getPlatformNumber() {
        return platformNumber;
    }
}