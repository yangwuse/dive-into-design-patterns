package structural.bridge.my.cars;

import structural.bridge.my.engines.Engine;

public class BigCar extends Car{
    public BigCar(Engine e) {
        engine = e;
    }

    @Override
    public void drive() {
        System.out.print("BigCar ");
        engine.start();
    }

}
