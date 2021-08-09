package creational.builder.bookcode.builders;

import creational.builder.bookcode.cars.*;
import creational.builder.bookcode.components.*;

// 实现每个构造步骤

public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission  transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsnavigator;


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
        this.gpsnavigator = gpsnavigator;        
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsnavigator);
    }
}
