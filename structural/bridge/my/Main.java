package structural.bridge.my;


import structural.bridge.my.cars.BigCar;
import structural.bridge.my.cars.Car;
import structural.bridge.my.cars.TinyCar;
import structural.bridge.my.engines.ElectricEngine;
import structural.bridge.my.engines.FuelEngine;

public class Main {
    public static void main(String[] args) {
        Car tinyFuelCar = new TinyCar(new FuelEngine());
        tinyFuelCar.drive();

        Car bigElectricCar = new BigCar(new ElectricEngine());
        bigElectricCar.drive();
    }

}
