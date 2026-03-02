/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/2/2026
 */

package week7.trainv1;

public class TrainStation {

    public static void main(String[] args) {
        Train train = new Train();
        ArrivalBoard arrivalBoard = new ArrivalBoard();
        PlatformIndicator platformIndicator = new PlatformIndicator();

        arrivalBoard.postArrival(
                train.getTrainId(),
                train.getSourceLocation()
        );
        platformIndicator.signalIncomingTrain(
                train.getPlatformNumber()
        );
    }
}