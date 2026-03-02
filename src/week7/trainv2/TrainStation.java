/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/2/2026
 */

package week7.trainv2;

import java.util.ArrayList;
import java.util.List;

public class TrainStation implements Subject {
    private List<Observer> observerList;
    private Train arrivedTrain;

    public TrainStation(){
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(arrivedTrain);
        }
    }
    public void setArrivedTrain(Train arrivedTrain) {
        this.arrivedTrain = arrivedTrain;
        notifyObservers();
    }
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation();

        ArrivalBoard arrivalBoard =
                new ArrivalBoard(trainStation);
        PlatformIndicator platformIndicator =
                new PlatformIndicator(trainStation);

        trainStation.setArrivedTrain(new Train());
        trainStation.setArrivedTrain(new Train());
        trainStation.setArrivedTrain(new Train());
    }
}