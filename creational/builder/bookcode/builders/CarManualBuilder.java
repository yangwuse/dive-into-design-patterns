package creational.builder.bookcode.builders;

import creational.builder.bookcode.cars.*;
import creational.builder.bookcode.components.*;

public class CarManualBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        this.tripComputer = computer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsnavigator) {
        this.gpsNavigator = gpsnavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
    
}
