package structural.bridge.my.cars;

import structural.bridge.my.engines.Engine;

public class TinyCar extends Car {
    public TinyCar(Engine e) {
        engine = e;
    }
    @Override
    public void drive() {
        System.out.print("TinyCar ");        
        engine.start();
    }
    
}
