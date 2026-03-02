/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/2/2026
 */

package week7.trainv2;

public class ArrivalBoard implements Observer {
    private TrainStation station;
    ArrivalBoard(TrainStation station){
        this.station = station;
        station.registerObserver(this);
    }
    @Override
    public void update(Train train) {
        postArrival(train.getTrainId(), train.getSourceLocation());
    }
    public void postArrival(String trainId, String source) {
        System.out.println("=== ARRIVAL BOARD ===");
        System.out.println("Train " + trainId + " arriving from " + source);
        System.out.println();
    }

}