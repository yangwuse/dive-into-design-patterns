package creational.builder.bookcode.builders;

public class CarManulBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer computer;
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
        this.computer = computer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsnavigator) {
        this.gpsnavigator = gpsnavigator;
    }
    
}
