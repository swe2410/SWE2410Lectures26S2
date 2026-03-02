/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/2/2026
 */

package week7.trainv2;

public class PlatformIndicator implements Observer {
    private TrainStation station;
    public PlatformIndicator(TrainStation station){
        this.station = station;
        this.station.registerObserver(this);
    }
    public void signalIncomingTrain(int platformNumber) {
        System.out.println(">>> Platform " + platformNumber +
                ": Incoming train. Please stand clear.");
        System.out.println();
    }
    @Override
    public void update(Train train) {
        signalIncomingTrain(train.getPlatformNumber());
    }
}