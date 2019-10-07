package Unit3.Train;

import Unit3.Time.Time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Train {
    private String destinationPoint;
    private int trainNumber;
    private Time departureTime;

    public Train() {
        destinationPoint = "UNKNOWN";
        trainNumber = 0;
        departureTime = new Time();
    }

    public Train(String destinationPoint, int trainNumber, Time departureTime) {
        this.destinationPoint = destinationPoint;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Time getDepartueTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
}
