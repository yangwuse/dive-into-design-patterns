package creational.builder.bookcode.builders;

import creational.builder.bookcode.cars.*;
import creational.builder.bookcode.components.*;

// Builder 定义了「所有可能的步骤」来组装一个产品

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer computer);
    void setGPSNavigator(GPSNavigator gpsnavigator);
}
