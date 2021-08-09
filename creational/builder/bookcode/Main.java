package creational.builder.bookcode;

import creational.builder.bookcode.builders.CarBuilder;
import creational.builder.bookcode.builders.CarManualBuilder;
import creational.builder.bookcode.cars.Car;
import creational.builder.bookcode.cars.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
